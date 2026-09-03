package com.app.base.impl;

import androidx.recyclerview.widget.LinearLayoutManager;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f11753OooO00o = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public LinearLayoutManager f11754OooO0O0 = null;

    public final Object OooO00o() {
        int i = this.f11753OooO00o;
        try {
            LinearLayoutManager linearLayoutManager = this.f11754OooO0O0;
            if (linearLayoutManager == null || linearLayoutManager.getItemCount() <= i) {
                return null;
            }
            return this.f11754OooO0O0.findViewByPosition(i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String toString() {
        int itemCount;
        LinearLayoutManager linearLayoutManager = this.f11754OooO0O0;
        int childCount = 0;
        if (linearLayoutManager != null) {
            childCount = linearLayoutManager.getChildCount();
            itemCount = this.f11754OooO0O0.getItemCount();
        } else {
            itemCount = 0;
        }
        StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("ScrollIndexModel{\n childCount=", childCount, "\n itemCount=", itemCount, "\n currentIndex=");
        sbOooO0O0.append(this.f11753OooO00o);
        sbOooO0O0.append("\n findFirstVisibleItemPosition=");
        LinearLayoutManager linearLayoutManager2 = this.f11754OooO0O0;
        sbOooO0O0.append(linearLayoutManager2 != null ? linearLayoutManager2.findFirstVisibleItemPosition() : -1);
        sbOooO0O0.append("\n findLastVisibleItemPosition=");
        LinearLayoutManager linearLayoutManager3 = this.f11754OooO0O0;
        sbOooO0O0.append(linearLayoutManager3 != null ? linearLayoutManager3.findLastVisibleItemPosition() : -1);
        sbOooO0O0.append("\n findFirstCompletelyVisibleItemPosition=");
        LinearLayoutManager linearLayoutManager4 = this.f11754OooO0O0;
        sbOooO0O0.append(linearLayoutManager4 != null ? linearLayoutManager4.findFirstCompletelyVisibleItemPosition() : -1);
        sbOooO0O0.append("\n findLastCompletelyVisibleItemPosition=");
        LinearLayoutManager linearLayoutManager5 = this.f11754OooO0O0;
        sbOooO0O0.append(linearLayoutManager5 != null ? linearLayoutManager5.findLastCompletelyVisibleItemPosition() : -1);
        sbOooO0O0.append("\n linearManager=");
        sbOooO0O0.append(this.f11754OooO0O0);
        sbOooO0O0.append('}');
        return sbOooO0O0.toString();
    }
}
