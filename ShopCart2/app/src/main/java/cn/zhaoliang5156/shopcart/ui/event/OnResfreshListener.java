package cn.zhaoliang5156.shopcart.ui.event;

/**
 * 刷新的接口
 *
 * @author zhaoliang
 * @version 1.0
 * @create 2018/9/17
 */
public interface OnResfreshListener {

    /**
     * 刷新界面 总价、总数量和全选的标识
     *
     * @param isSelect 是否是全选
     */
    void onResfresh(boolean isSelect);
}
