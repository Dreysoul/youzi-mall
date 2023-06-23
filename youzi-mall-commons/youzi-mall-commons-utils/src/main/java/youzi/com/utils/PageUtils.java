package youzi.com.utils;

import java.util.List;

public class PageUtils<T>{
    private Long page;//当前页面
    private Long limit;//页面大小
    private Long pageCount;//总页数
    private Long totalCount;//总条数

    private List<T> datas;//查询的数据

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public PageUtils() {

    }

    public PageUtils(Long page, Long limit, Long pageCount, Long totalCount, List<T> datas) {
        this.page = page;
        this.limit = limit;
        this.pageCount = pageCount;
        this.totalCount = totalCount;
        this.datas = datas;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Long getPageCount() {
        return pageCount;
    }

    public void setPageCount(Long pageCount) {
        this.pageCount = pageCount;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}
