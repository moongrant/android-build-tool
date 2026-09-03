package com.app.base.bean;

/* JADX INFO: loaded from: classes.dex */
public class AbsJavaBeanApiList<Model> extends AbsJavaBeanApi<Model> {
    private PageModel page;

    public static class PageModel extends AbsJavaBean {
        private long datesort;
        private int pageindex;
        private int pagesize;

        public void clean() {
            this.pageindex = 0;
            this.datesort = 0L;
            this.pagesize = 0;
        }

        public long getDatesort() {
            return this.datesort;
        }

        public int getPageindex() {
            return this.pageindex;
        }

        public int getPagesize() {
            return this.pagesize;
        }
    }

    public PageModel getPage() {
        return this.page;
    }
}
