package p023Oooo00O;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000O0o<Object> f1063Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object f1064Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000Oo0.OooO00o<Object, Object> f1065Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f1066Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(Object obj, o000Oo0.OooO00o<Object, Object> oooO00o, Object obj2, o000O0o<Object> o000o0o2) {
        super(0);
        this.f1064Oooo0o = obj;
        this.f1065Oooo0oO = oooO00o;
        this.f1066Oooo0oo = obj2;
        this.f1063Oooo = o000o0o2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!Intrinsics.areEqual(this.f1064Oooo0o, this.f1065Oooo0oO.f1094Oooo0o) || !Intrinsics.areEqual(this.f1066Oooo0oo, this.f1065Oooo0oO.f1095Oooo0oO)) {
            o000Oo0.OooO00o<Object, Object> oooO00o = this.f1065Oooo0oO;
            ?? r4 = this.f1064Oooo0o;
            ?? r5 = this.f1066Oooo0oo;
            o000O0o<Object> animationSpec = this.f1063Oooo;
            Objects.requireNonNull(oooO00o);
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            oooO00o.f1094Oooo0o = r4;
            oooO00o.f1095Oooo0oO = r5;
            oooO00o.f1093Oooo = animationSpec;
            oooO00o.f1098OoooO0 = new o00O00o0<>(animationSpec, oooO00o.f1096Oooo0oo, r4, r5, null);
            oooO00o.f1102o000oOoO.f1090OooO0O0.setValue(Boolean.TRUE);
            oooO00o.f1100OoooO0O = false;
            oooO00o.f1097OoooO = true;
        }
        return Unit.INSTANCE;
    }
}
