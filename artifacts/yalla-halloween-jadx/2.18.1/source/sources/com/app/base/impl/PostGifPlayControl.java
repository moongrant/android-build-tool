package com.app.base.impl;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.mixedroom.room_bottom.DefaultLifeCycleObserver;
import com.yalla.yalla.ui.view.MomentDetailView;
import java.util.ArrayList;
import java.util.Objects;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes.dex */
public final class PostGifPlayControl {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LifecycleOwner f11755OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RecyclerView f11756OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public MomentDetailView f11757OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0O0 f11758OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO0OO f11759OooO0o0;

    public class OooO00o extends RecyclerView.o00O0O {
        public OooO00o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                PostGifPlayControl.this.OooO0O0();
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0133 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:103:0x0123 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:56:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:65:0x00f9 A[Catch: Exception -> 0x011b, TryCatch #1 {Exception -> 0x011b, blocks: (B:63:0x00f5, B:65:0x00f9, B:67:0x0105, B:70:0x010f), top: B:83:0x00f5 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0105 A[Catch: Exception -> 0x011b, TryCatch #1 {Exception -> 0x011b, blocks: (B:63:0x00f5, B:65:0x00f9, B:67:0x0105, B:70:0x010f), top: B:83:0x00f5 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x010f A[Catch: Exception -> 0x011b, TRY_LEAVE, TryCatch #1 {Exception -> 0x011b, blocks: (B:63:0x00f5, B:65:0x00f9, B:67:0x0105, B:70:0x010f), top: B:83:0x00f5 }] */
        /* JADX WARN: Code duplicated, block: B:77:0x0129  */
        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<View> arrayList;
            LinearLayoutManager linearLayoutManager;
            int iFindFirstVisibleItemPosition;
            int iFindLastVisibleItemPosition;
            MomentDetailView momentDetailView;
            PostGifPlayControl postGifPlayControl;
            int i;
            PostGifPlayControl postGifPlayControl2 = PostGifPlayControl.this;
            RecyclerView recyclerView = postGifPlayControl2.f11756OooO0O0;
            Objects.requireNonNull(postGifPlayControl2);
            com.app.base.impl.OooO00o oooO00o = new com.app.base.impl.OooO00o();
            if (recyclerView != null && recyclerView.getLayoutManager() != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) recyclerView.getLayoutManager();
                oooO00o.f11754OooO0O0 = linearLayoutManager2;
                int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager2.findFirstCompletelyVisibleItemPosition();
                int iFindLastCompletelyVisibleItemPosition = linearLayoutManager2.findLastCompletelyVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition == 0) {
                    oooO00o.f11753OooO00o = iFindFirstCompletelyVisibleItemPosition;
                } else {
                    int iFindFirstCompletelyVisibleItemPosition2 = -1;
                    if (iFindLastCompletelyVisibleItemPosition == linearLayoutManager2.getItemCount() - 1) {
                        oooO00o.f11753OooO00o = iFindLastCompletelyVisibleItemPosition;
                    } else {
                        if (linearLayoutManager2.findFirstCompletelyVisibleItemPosition() >= 0) {
                            try {
                                iFindFirstCompletelyVisibleItemPosition2 = linearLayoutManager2.findFirstCompletelyVisibleItemPosition();
                                int iFindLastCompletelyVisibleItemPosition2 = linearLayoutManager2.findLastCompletelyVisibleItemPosition();
                                if (iFindFirstCompletelyVisibleItemPosition2 != iFindLastCompletelyVisibleItemPosition2) {
                                    i = iFindFirstCompletelyVisibleItemPosition2;
                                    int i2 = 0;
                                    while (iFindFirstCompletelyVisibleItemPosition2 <= iFindLastCompletelyVisibleItemPosition2) {
                                        try {
                                            View viewFindViewByPosition = linearLayoutManager2.findViewByPosition(iFindFirstCompletelyVisibleItemPosition2);
                                            if (viewFindViewByPosition != null) {
                                                viewFindViewByPosition.getLocationOnScreen(new int[2]);
                                                Rect rect = new Rect();
                                                viewFindViewByPosition.getLocalVisibleRect(rect);
                                                int i3 = rect.bottom - rect.top;
                                                if (i3 > i2) {
                                                    i = iFindFirstCompletelyVisibleItemPosition2;
                                                    i2 = i3;
                                                }
                                            }
                                            iFindFirstCompletelyVisibleItemPosition2++;
                                        } catch (Exception e) {
                                            e = e;
                                            iFindFirstCompletelyVisibleItemPosition2 = i;
                                            e.printStackTrace();
                                            oooO00o.f11753OooO00o = iFindFirstCompletelyVisibleItemPosition2 >= 0 ? iFindFirstCompletelyVisibleItemPosition2 : 0;
                                            o00O00.OooO0O0("滚动停止 \n " + oooO00o);
                                            if (oooO00o.OooO00o() != null) {
                                                momentDetailView = (MomentDetailView) oooO00o.OooO00o();
                                                postGifPlayControl = PostGifPlayControl.this;
                                                if (momentDetailView != postGifPlayControl.f11757OooO0OO) {
                                                    postGifPlayControl.OooO0OO();
                                                }
                                                momentDetailView.OooOO0o();
                                                PostGifPlayControl.this.f11757OooO0OO = momentDetailView;
                                            }
                                            arrayList = new ArrayList();
                                            linearLayoutManager = oooO00o.f11754OooO0O0;
                                            if (linearLayoutManager != null) {
                                                iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                                                iFindLastVisibleItemPosition = oooO00o.f11754OooO0O0.findLastVisibleItemPosition();
                                                if (iFindFirstVisibleItemPosition >= 0) {
                                                    while (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                                                        arrayList.add(oooO00o.f11754OooO0O0.findViewByPosition(iFindFirstVisibleItemPosition));
                                                        iFindFirstVisibleItemPosition++;
                                                    }
                                                }
                                            }
                                            for (View view : arrayList) {
                                                if (view instanceof MomentDetailView) {
                                                    ((MomentDetailView) view).OooOOO();
                                                }
                                            }
                                        }
                                    }
                                    iFindFirstCompletelyVisibleItemPosition2 = i;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } else {
                            try {
                                iFindFirstCompletelyVisibleItemPosition2 = linearLayoutManager2.findFirstVisibleItemPosition();
                                int iFindLastVisibleItemPosition2 = linearLayoutManager2.findLastVisibleItemPosition();
                                if (iFindFirstCompletelyVisibleItemPosition2 != iFindLastVisibleItemPosition2) {
                                    i = iFindFirstCompletelyVisibleItemPosition2;
                                    int i4 = 0;
                                    while (iFindFirstCompletelyVisibleItemPosition2 <= iFindLastVisibleItemPosition2) {
                                        try {
                                            View viewFindViewByPosition2 = linearLayoutManager2.findViewByPosition(iFindFirstCompletelyVisibleItemPosition2);
                                            if (viewFindViewByPosition2 != null) {
                                                viewFindViewByPosition2.getLocationOnScreen(new int[2]);
                                                Rect rect2 = new Rect();
                                                viewFindViewByPosition2.getLocalVisibleRect(rect2);
                                                int i5 = rect2.bottom - rect2.top;
                                                if (i5 > i4) {
                                                    i = iFindFirstCompletelyVisibleItemPosition2;
                                                    i4 = i5;
                                                }
                                            }
                                            iFindFirstCompletelyVisibleItemPosition2++;
                                        } catch (Exception e3) {
                                            e = e3;
                                            e.printStackTrace();
                                            iFindFirstCompletelyVisibleItemPosition2 = i;
                                            oooO00o.f11753OooO00o = iFindFirstCompletelyVisibleItemPosition2 >= 0 ? iFindFirstCompletelyVisibleItemPosition2 : 0;
                                            o00O00.OooO0O0("滚动停止 \n " + oooO00o);
                                            if (oooO00o.OooO00o() != null) {
                                                momentDetailView = (MomentDetailView) oooO00o.OooO00o();
                                                postGifPlayControl = PostGifPlayControl.this;
                                                if (momentDetailView != postGifPlayControl.f11757OooO0OO) {
                                                    postGifPlayControl.OooO0OO();
                                                }
                                                momentDetailView.OooOO0o();
                                                PostGifPlayControl.this.f11757OooO0OO = momentDetailView;
                                            }
                                            arrayList = new ArrayList();
                                            linearLayoutManager = oooO00o.f11754OooO0O0;
                                            if (linearLayoutManager != null) {
                                                iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                                                iFindLastVisibleItemPosition = oooO00o.f11754OooO0O0.findLastVisibleItemPosition();
                                                if (iFindFirstVisibleItemPosition >= 0) {
                                                    while (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                                                        arrayList.add(oooO00o.f11754OooO0O0.findViewByPosition(iFindFirstVisibleItemPosition));
                                                        iFindFirstVisibleItemPosition++;
                                                    }
                                                }
                                            }
                                            while (r0.hasNext()) {
                                                if (view instanceof MomentDetailView) {
                                                    ((MomentDetailView) view).OooOOO();
                                                }
                                            }
                                        }
                                    }
                                    iFindFirstCompletelyVisibleItemPosition2 = i;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                i = iFindFirstCompletelyVisibleItemPosition2;
                            }
                        }
                        oooO00o.f11753OooO00o = iFindFirstCompletelyVisibleItemPosition2 >= 0 ? iFindFirstCompletelyVisibleItemPosition2 : 0;
                    }
                }
            }
            o00O00.OooO0O0("滚动停止 \n " + oooO00o);
            if (oooO00o.OooO00o() != null && (oooO00o.OooO00o() instanceof MomentDetailView)) {
                momentDetailView = (MomentDetailView) oooO00o.OooO00o();
                postGifPlayControl = PostGifPlayControl.this;
                if (momentDetailView != postGifPlayControl.f11757OooO0OO) {
                    postGifPlayControl.OooO0OO();
                }
                momentDetailView.OooOO0o();
                PostGifPlayControl.this.f11757OooO0OO = momentDetailView;
            }
            arrayList = new ArrayList();
            try {
                linearLayoutManager = oooO00o.f11754OooO0O0;
                if (linearLayoutManager != null) {
                    iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    iFindLastVisibleItemPosition = oooO00o.f11754OooO0O0.findLastVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition >= 0 && oooO00o.f11754OooO0O0.getItemCount() > iFindLastVisibleItemPosition) {
                        while (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                            arrayList.add(oooO00o.f11754OooO0O0.findViewByPosition(iFindFirstVisibleItemPosition));
                            iFindFirstVisibleItemPosition++;
                        }
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            while (r0.hasNext()) {
                if (view instanceof MomentDetailView) {
                    ((MomentDetailView) view).OooOOO();
                }
            }
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PostGifPlayControl.this.OooO0OO();
            PostGifPlayControl.this.f11757OooO0OO.OooOO0o();
            PostGifPlayControl.this.f11757OooO0OO.OooOOO();
        }
    }

    public PostGifPlayControl(LifecycleOwner lifecycleOwner, RecyclerView recyclerView) {
        this.f11758OooO0Oo = new OooO0O0();
        this.f11759OooO0o0 = new OooO0OO();
        this.f11755OooO00o = lifecycleOwner;
        this.f11756OooO0O0 = recyclerView;
        OooO00o();
    }

    public final void OooO00o() {
        this.f11755OooO00o.getLifecycle().addObserver(new DefaultLifeCycleObserver() { // from class: com.app.base.impl.PostGifPlayControl.1
            @Override // com.app.base.mixedroom.room_bottom.DefaultLifeCycleObserver
            public final void onResume() {
                super.onResume();
                PostGifPlayControl.this.OooO0O0();
            }
        });
        RecyclerView recyclerView = this.f11756OooO0O0;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new OooO00o());
        }
    }

    public final void OooO0O0() {
        RecyclerView recyclerView = this.f11756OooO0O0;
        if (recyclerView != null) {
            if (recyclerView.getHandler() != null) {
                this.f11756OooO0O0.getHandler().removeCallbacks(this.f11758OooO0Oo);
            }
            this.f11756OooO0O0.postDelayed(this.f11758OooO0Oo, 200L);
        } else {
            MomentDetailView momentDetailView = this.f11757OooO0OO;
            if (momentDetailView != null) {
                if (momentDetailView.getHandler() != null) {
                    this.f11757OooO0OO.getHandler().removeCallbacks(this.f11759OooO0o0);
                }
                this.f11757OooO0OO.postDelayed(this.f11759OooO0o0, 200L);
            }
        }
    }

    public final void OooO0OO() {
        MomentDetailView momentDetailView = this.f11757OooO0OO;
        if (momentDetailView != null) {
            momentDetailView.OooOO0O();
        }
    }

    public PostGifPlayControl(LifecycleOwner lifecycleOwner, MomentDetailView momentDetailView) {
        this.f11758OooO0Oo = new OooO0O0();
        this.f11759OooO0o0 = new OooO0OO();
        this.f11755OooO00o = lifecycleOwner;
        this.f11756OooO0O0 = null;
        this.f11757OooO0OO = momentDetailView;
        OooO00o();
    }
}
