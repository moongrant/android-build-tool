package p142o00OOooO;

import androidx.activity.result.OooO00o;
import com.app.base.fragment.CoinDetailFragment;
import com.app.base.fragment.room.RoomInfoMomentFragment;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yalla.yalla.ui.view.MomentDetailView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o00Oo00.OooO0O0;
import p133o00OO00o.OooOOO0;
import p172o00OooO.o00O0O0O;
import p174o00OooOO.o0O00OOO;
import p181o00o000.OooO;
import p186o00o00Oo.o0ooOOo;
import p381o0OOoOOO.o00OOOOo;
import p406o0Oo0OOO.oO00000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO implements o0ooOOo, o00O0O0O, OnSuccessListener, OooO00o, OooOOO0.OooO0O0, o0O00OOO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f31895OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f31896OooO0o0;

    public /* synthetic */ OooOOO(Object obj, int i) {
        this.f31895OooO0Oo = i;
        this.f31896OooO0o0 = obj;
    }

    @Override // o00OooOO.o0O00OOO.OooO00o
    public final void OooO00o() {
        MomentDetailView this$0 = (MomentDetailView) this.f31896OooO0o0;
        int i = MomentDetailView.f24937OoooooO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOo00();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p172o00OooO.o00O0O0O
    public final void OooO0O0(String str) {
        OooO oooO = (OooO) this.f31896OooO0o0;
        Objects.requireNonNull(oooO);
        if (str.length() > 0) {
            oooO.f32948OoooO0O.setVisibility(0);
        } else {
            oooO.f32948OoooO0O.setVisibility(8);
        }
        AbsListenerTag absListenerTag = AbsListenerTag.Default;
        OooO0O0<Model, Tag> oooO0O0 = oooO.f32160Oooo;
        if (oooO0O0 != 0) {
            oooO0O0.OooO0O0((Model) str, -1, (Tag) absListenerTag);
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f31895OooO0Oo) {
            case 0:
                ((CoinDetailFragment) this.f31896OooO0o0).lambda$initView$0();
                break;
            default:
                RoomInfoMomentFragment.m71initView$lambda10((RoomInfoMomentFragment) this.f31896OooO0o0);
                break;
        }
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        oO00000 this$0 = (oO00000) this.f31896OooO0o0;
        int i = oO00000.f39104OoooOO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0o0();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z;
        o00OOOOo o00ooooo2 = (o00OOOOo) obj;
        if (((FirebaseMessaging) this.f31896OooO0o0).f19181OooO0oO.OooO0O0()) {
            if (o00ooooo2.f38803OooO0oo.OooO00o() != null) {
                synchronized (o00ooooo2) {
                    z = o00ooooo2.f38802OooO0oO;
                }
                if (z) {
                    return;
                }
                o00ooooo2.OooO0oO(0L);
            }
        }
    }
}
