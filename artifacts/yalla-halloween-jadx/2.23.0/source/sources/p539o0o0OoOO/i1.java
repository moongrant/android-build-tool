package p539o0o0OoOO;

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
import p399o0Oo0O0O.o00O0O;
import p519o0o0O0oO.b1;
import p571o0oOoOO.o0O0OOO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes5.dex */
public final class i1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ v0 f55565OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ComposeView f55566OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LiveRoomVM f55567OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ GifListJson f55568OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f55569OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55570OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ComposeView composeView, GifListJson gifListJson, LiveRoomVM liveRoomVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, v0 v0Var) {
        super(0);
        this.f55566OooO0Oo = composeView;
        this.f55568OooO0o0 = gifListJson;
        this.f55567OooO0o = liveRoomVM;
        this.f55569OooO0oO = o0o0ooo0;
        this.f55570OooO0oo = lifecycleOwner;
        this.f55565OooO = v0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.f55566OooO0Oo.getContext();
        Object obj = context instanceof Activity ? (Activity) context : null;
        GifListJson gifListJson = this.f55568OooO0o0;
        h1 confirmClick = new h1(this.f55567OooO0o, gifListJson, this.f55569OooO0oO, this.f55570OooO0oo, this.f55565OooO);
        Intrinsics.checkNotNullParameter(gifListJson, "gifListJson");
        Intrinsics.checkNotNullParameter(confirmClick, "confirmClick");
        o0OO000.OooO00o("302009");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
        ((o00O0O) obj).showDialog(null, ComposableLambdaKt.composableLambdaInstance(852008412, true, new b1(confirmClick, gifListJson)));
        return Unit.INSTANCE;
    }
}
