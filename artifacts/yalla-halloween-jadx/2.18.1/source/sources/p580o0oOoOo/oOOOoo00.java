package p580o0oOoOo;

import android.app.Dialog;
import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o0O0O00;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.Oooo000;
import com.weieyu.yalla.R;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p177o00Ooooo.oO0O000o;
import p254o00ooO0O.o000O0O0;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOOOoo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOOOoo00 f46690OooO00o = new oOOOoo00();

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomOnlineListDialog$OnDialog$1", f = "LiveRoomOnlineListDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f46691Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<oO0O000o> f46692Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, o0O00OO<oO0O000o> o0o00oo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f46691Oooo0o = context;
            this.f46692Oooo0oO = o0o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f46691Oooo0o, this.f46692Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            oO0O000o oo0o000oOooO0O0;
            oO0O000o oo0o000oOooO0O1;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
            if (o00O.OooOO0.f43244OooO0O0.getValue().booleanValue()) {
                if (oOOOoo00.OooO0O0(this.f46692Oooo0oO) == null) {
                    this.f46692Oooo0oO.setValue(new oO0O000o());
                    oO0O000o oo0o000oOooO0O2 = oOOOoo00.OooO0O0(this.f46692Oooo0oO);
                    if (oo0o000oOooO0O2 != null) {
                        oo0o000oOooO0O2.f32900OoooOoo = Oooo000.f12733OooO0o0;
                    }
                }
                Context context = this.f46691Oooo0o;
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity != null && (oo0o000oOooO0O1 = oOOOoo00.OooO0O0(this.f46692Oooo0oO)) != null) {
                    oo0o000oOooO0O1.show(fragmentActivity.getSupportFragmentManager(), o000O0O0.OooO0OO(R.string.Online_Users) + ": " + oooOO1.OooO00o());
                }
            } else {
                oO0O000o oo0o000oOooO0O3 = oOOOoo00.OooO0O0(this.f46692Oooo0oO);
                if (oo0o000oOooO0O3 != null) {
                    o0O00OO<oO0O000o> o0o00oo2 = this.f46692Oooo0oO;
                    Dialog dialog = oo0o000oOooO0O3.getDialog();
                    if ((dialog != null && dialog.isShowing()) && (oo0o000oOooO0O0 = oOOOoo00.OooO0O0(o0o00oo2)) != null) {
                        oo0o000oOooO0O0.dismiss();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f46694Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(2);
            this.f46694Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oOOOoo00.this.OooO00o(ooo00o, this.f46694Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final oO0O000o OooO0O0(o0O00OO o0o00oo2) {
        return (oO0O000o) o0o00oo2.getValue();
    }

    @Composable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(161514577);
        if ((i & 1) == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Context context = (Context) ooo00oOooOOo.OooOO0o(o0O0O00.f6591OooO0O0);
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = o0OOO00.OooO0Oo(null);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
            o00Oo00.OooO0o0(o00O.OooOO0.f43244OooO0O0.getValue(), new OooO00o(context, (o0O00OO) objOooO0o, null), ooo00oOooOOo);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(i));
    }
}
