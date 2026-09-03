package com.yalla.yalla.ui.fragment;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.view.EmojiFaceView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000Oo0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f28400OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f28401OooO0o0;

    public /* synthetic */ o000Oo0(Object obj, int i) {
        this.f28400OooO0Oo = i;
        this.f28401OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f28400OooO0Oo;
        Object obj2 = this.f28401OooO0o0;
        switch (i) {
            case 0:
                TreasureBoxFragment.onViewCreated$lambda$0((TreasureBoxFragment) obj2, obj);
                break;
            default:
                EmojiFaceView this$0 = (EmojiFaceView) obj2;
                List list = (List) obj;
                int i2 = EmojiFaceView.f29840OooO0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (list != null) {
                    this$0.f29841OooO0Oo.OooOoO0(list);
                }
                break;
        }
    }
}
