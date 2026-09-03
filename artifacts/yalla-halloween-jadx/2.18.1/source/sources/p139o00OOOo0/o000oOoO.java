package p139o00OOOo0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.base.activity.BaseFragmentActivity;
import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o000O0O0;
import p257o00ooOO0.o0O0oo0o;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000oOoO f31805OooO00o = new o000oOoO();

    public static final class OooO00o extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f31806Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<o0O00OO<Boolean>> f31807Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f31808Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f31809Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f31810OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Ref.ObjectRef<o0O00OO<Boolean>> objectRef, Ref.ObjectRef<String> objectRef2, Ref.ObjectRef<String> objectRef3, Function0<Unit> function0, Function0<Unit> function1) {
            super(3);
            this.f31807Oooo0o = objectRef;
            this.f31808Oooo0oO = objectRef2;
            this.f31809Oooo0oo = objectRef3;
            this.f31806Oooo = function0;
            this.f31810OoooO00 = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, o000oOoO.o0O00OO] */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, Integer num) {
            o0O00OO<Boolean> it = o0o00oo2;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 14) == 0) {
                iIntValue |= ooo00o2.Oooo0oo(it) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                this.f31807Oooo0o.element = it;
                o0O0oo0o.OooO0Oo(it, this.f31808Oooo0oO.element, this.f31809Oooo0oo.element, null, false, false, null, this.f31806Oooo, o000O0O0.OooO0OO(R.string.OK), false, null, false, this.f31810OoooO00, null, false, null, Oooo0.f31731Oooo0o, null, null, ooo00o2, i & 14, 1572864, 454264);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v16, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v9, types: [T, java.lang.String] */
    @Nullable
    public final o0O00OO<Boolean> OooO00o(@NotNull BaseFragmentActivity activity, @NotNull String uiType, @Nullable Function0<Unit> function0, @NotNull Function0<Unit> onConfirmClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(uiType, "uiType");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        int iHashCode = uiType.hashCode();
        if (iHashCode != -1298587734) {
            if (iHashCode != -841454749) {
                if (iHashCode == 613961165 && uiType.equals("unJoin&unFollow")) {
                    objectRef.element = o000O0O0.OooO0OO(R.string.un_join_and_follow);
                    objectRef2.element = o000O0O0.OooO0OO(R.string.un_join_and_follow_content);
                }
            } else if (uiType.equals("unJoin")) {
                objectRef.element = o000O0O0.OooO0OO(R.string.Unjoin);
                objectRef2.element = o000O0O0.OooO0OO(R.string.un_join_content);
            }
        } else if (uiType.equals("unFollow")) {
            objectRef.element = o000O0O0.OooO0OO(R.string.Unfollow);
            objectRef2.element = o000O0O0.OooO0OO(R.string.un_follow_content);
        }
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        activity.showDialog((String) null, o00O0000.OooO0O0(-1804161237, true, new OooO00o(objectRef3, objectRef, objectRef2, function0, onConfirmClick)));
        return (o0O00OO) objectRef3.element;
    }
}
