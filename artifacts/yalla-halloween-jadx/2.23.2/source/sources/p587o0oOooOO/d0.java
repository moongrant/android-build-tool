package p587o0oOooOO;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p404o0Oo0OO0.o00O0O;
import p577o0oOoOo.o0oOo0O0;
import p650o0ooo.e1;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ q f56770OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ComposeView f56771OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LiveRoomVM f56772OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ GifListJson f56773OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f56774OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f56775OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ComposeView composeView, GifListJson gifListJson, LiveRoomVM liveRoomVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner, q qVar) {
        super(0);
        this.f56771OooO0Oo = composeView;
        this.f56773OooO0o0 = gifListJson;
        this.f56772OooO0o = liveRoomVM;
        this.f56774OooO0oO = o0ooo0o1;
        this.f56775OooO0oo = lifecycleOwner;
        this.f56770OooO = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.f56771OooO0Oo.getContext();
        Object obj = context instanceof Activity ? (Activity) context : null;
        GifListJson gifListJson = this.f56773OooO0o0;
        c0 confirmClick = new c0(this.f56772OooO0o, gifListJson, this.f56774OooO0oO, this.f56775OooO0oo, this.f56770OooO);
        Intrinsics.checkNotNullParameter(gifListJson, "gifListJson");
        Intrinsics.checkNotNullParameter(confirmClick, "confirmClick");
        OooO00o.OooO0O0("302009");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
        ((o00O0O) obj).showDialog(null, ComposableLambdaKt.composableLambdaInstance(852008412, true, new e1(confirmClick, gifListJson)));
        return Unit.INSTANCE;
    }
}
