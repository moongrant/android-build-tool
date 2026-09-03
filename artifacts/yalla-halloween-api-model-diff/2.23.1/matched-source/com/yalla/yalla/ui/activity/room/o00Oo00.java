package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.fragment.TreasureBoxFragment;
import com.yalla.yalla.ui.view.EmojiFaceView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00Oo00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f26440OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f26441OooO0o0;

    public /* synthetic */ o00Oo00(Object obj, int i) {
        this.f26440OooO0Oo = i;
        this.f26441OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f26440OooO0Oo;
        Object obj2 = this.f26441OooO0o0;
        switch (i) {
            case 0:
                RoomThemeStoreActivity this$0 = (RoomThemeStoreActivity) obj2;
                int i2 = RoomThemeStoreActivity.f26227OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO0();
                break;
            case 1:
                TreasureBoxFragment.onViewCreated$lambda$0((TreasureBoxFragment) obj2, obj);
                break;
            default:
                EmojiFaceView this$1 = (EmojiFaceView) obj2;
                List list = (List) obj;
                int i3 = EmojiFaceView.f29850OooO0oo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (list != null) {
                    this$1.f29851OooO0Oo.OooOoO0(list);
                }
                break;
        }
    }
}
