
import java.util.Arrays;

/** 
 * <b>function:</b> 
 * @author  Awen
 * 创建时间：2015年5月16日 下午12:01:45 
 */
public class SortUtil implements SortValue{

	public void sort(String[] params){
		sort(params, 0, params.length - 1);
	}
	
	private void sort(String[] params, int left, int right){
		if (left >= right) {
			return;
		}
		int tmpleft = left;
		int tmpright = right;
		while (left < right) {
			while (left < right && getValue(params[left]) <= getValue(params[right])){
				right--;
			}
			if (left < right) {
				swap(params, left, right);
			}
			while (left < right && getValue(params[left]) <= getValue(params[right]))
				left++;
			if (left < right) {
				swap(params, left, right);
			}
		}
		sort(params, tmpleft, left - 1);
		sort(params, left + 1, tmpright);
	}
	
	private void swap(String[] params, int left, int right){
		String tmp = params[left];
		params[left] = params[right];
		params[right] = tmp;
	}
	
	public static void main(String[] args) {
		String[] params = {"ca","ac","wc"};
		new SortUtil().sort(params);
		System.out.println(Arrays.toString(params));
	}

	@Override
	public int getValue(Object obj) {
		return String.valueOf(obj).hashCode();
	}
}
interface SortValue{
	int getValue(Object obj);
}