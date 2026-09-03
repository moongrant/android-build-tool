package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p207o00o0oO0.o000O0Oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O000o {

    public static final class OooO00o extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<MutableState<Boolean>> f58527OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f58528OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f58529OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f58530OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f58531OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Ref.ObjectRef<MutableState<Boolean>> objectRef, Ref.ObjectRef<String> objectRef2, Ref.ObjectRef<String> objectRef3, Function0<Unit> function0, Function0<Unit> function1) {
            super(3);
            this.f58527OooO0Oo = objectRef;
            this.f58529OooO0o0 = objectRef2;
            this.f58528OooO0o = objectRef3;
            this.f58530OooO0oO = function0;
            this.f58531OooO0oo = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.runtime.MutableState, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
            MutableState<Boolean> it = mutableState;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(it) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1130815616, i, -1, "com.yalla.yalla.ui.dialog.CenterTextDialogUtil.showOpenNobleDialog.<anonymous> (CenterTextDialogUtil.kt:44)");
                }
                this.f58527OooO0Oo.element = it;
                o000O0Oo.OooO0Oo(it, this.f58529OooO0o0.element, this.f58528OooO0o.element, null, false, false, null, this.f58530OooO0oO, o0000.OooO0OO(o000000.OK), false, null, false, this.f58531OooO0oo, null, false, false, null, o00O000.f58525OooO0Oo, null, null, composer2, i & 14, 12582912, 913016);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v16, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9, types: [T, java.lang.String] */
    @Nullable
    public static MutableState OooO00o(@NotNull BaseFragmentActivity activity, @NotNull String uiType, @Nullable Function0 function0, @NotNull Function0 onConfirmClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(uiType, "uiType");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        int iHashCode = uiType.hashCode();
        if (iHashCode != -1298587734) {
            if (iHashCode != -841454749) {
                if (iHashCode == 613961165 && uiType.equals("unJoin&unFollow")) {
                    objectRef.element = o0000.OooO0OO(o000000.un_join_and_follow);
                    objectRef2.element = o0000.OooO0OO(o000000.un_join_and_follow_content);
                }
            } else if (uiType.equals("unJoin")) {
                objectRef.element = o0000.OooO0OO(o000000.Unjoin);
                objectRef2.element = o0000.OooO0OO(o000000.un_join_content);
            }
        } else if (uiType.equals("unFollow")) {
            objectRef.element = o0000.OooO0OO(o000000.Unfollow);
            objectRef2.element = o0000.OooO0OO(o000000.un_follow_content);
        }
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(1130815616, true, new OooO00o(objectRef3, objectRef, objectRef2, function0, onConfirmClick)));
        return (MutableState) objectRef3.element;
    }
}
