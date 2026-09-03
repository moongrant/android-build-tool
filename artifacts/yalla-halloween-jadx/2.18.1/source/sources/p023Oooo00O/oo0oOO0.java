package p023Oooo00O;

import androidx.compose.animation.core.InternalAnimationApi;
import androidx.compose.runtime.Composable;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class oo0oOO0 {

    public static final class OooO00o extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oo00o<T> f1325Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oo00o<T> oo00oVar) {
            super(1);
            this.f1325Oooo0o = oo00oVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o00O0OOO(this.f1325Oooo0o);
        }
    }

    @Composable
    @InternalAnimationApi
    @NotNull
    public static final oo00o.OooO00o OooO00o(@NotNull oo00o oo00oVar, @NotNull o00OO0O0 typeConverter, @Nullable String str, @Nullable oOO00O ooo00o, int i) {
        oo00o<S>.C0010OooO00o<T, V>.OooO00o<T, V> c0010OooO00o;
        Intrinsics.checkNotNullParameter(oo00oVar, "<this>");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        ooo00o.OooO0o0(-1714122528);
        if ((i & 2) != 0) {
            str = "DeferredAnimation";
        }
        ooo00o.OooO0o0(1157296644);
        boolean zOooo0oo = ooo00o.Oooo0oo(oo00oVar);
        Object objOooO0o = ooo00o.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new oo00o.OooO00o(oo00oVar, typeConverter, str);
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        oo00o.OooO00o oooO00o = (oo00o.OooO00o) objOooO0o;
        o00Oo00.OooO0O0(oooO00o, new o00O0OO0(oo00oVar, oooO00o), ooo00o);
        if (oo00oVar.OooO0oO() && (c0010OooO00o = oooO00o.f1262OooO0OO) != null) {
            oo00o<S> oo00oVar2 = oooO00o.f1263OooO0Oo;
            c0010OooO00o.f1265Oooo0o.OooOOo(c0010OooO00o.f1267Oooo0oo.invoke(oo00oVar2.OooO0Oo().OooO00o()), c0010OooO00o.f1267Oooo0oo.invoke(oo00oVar2.OooO0Oo().OooO0OO()), c0010OooO00o.f1266Oooo0oO.invoke(oo00oVar2.OooO0Oo()));
        }
        ooo00o.Oooo0o0();
        return oooO00o;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final oO0Oo OooO0O0(@NotNull oo00o oo00oVar, Object obj, Object obj2, @NotNull o0000O0O animationSpec, @NotNull o00OO0O0 typeConverter, @NotNull String label, @Nullable oOO00O ooo00o) {
        Intrinsics.checkNotNullParameter(oo00oVar, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(label, "label");
        ooo00o.OooO0o0(-304821198);
        ooo00o.OooO0o0(1157296644);
        boolean zOooo0oo = ooo00o.Oooo0oo(oo00oVar);
        Object objOooO0o = ooo00o.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new oo00o.OooO0o(oo00oVar, obj, o0OOO0o.OooO0OO(typeConverter, obj2), typeConverter, label);
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        oo00o.OooO0o oooO0o = (oo00o.OooO0o) objOooO0o;
        if (oo00oVar.OooO0oO()) {
            oooO0o.OooOOo(obj, obj2, animationSpec);
        } else {
            oooO0o.OooOOoo(obj2, animationSpec);
        }
        o00Oo00.OooO0O0(oooO0o, new o00O0OO(oo00oVar, oooO0o), ooo00o);
        ooo00o.Oooo0o0();
        return oooO0o;
    }

    @Composable
    @NotNull
    public static final <T> oo00o<T> OooO0OO(T t, @Nullable String str, @Nullable oOO00O ooo00o, int i, int i2) {
        ooo00o.OooO0o0(2029166765);
        if ((i2 & 2) != 0) {
            str = null;
        }
        ooo00o.OooO0o0(-492369756);
        Object objOooO0o = ooo00o.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new oo00o(new o000O(t), str);
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        oo00o<T> oo00oVar = (oo00o) objOooO0o;
        oo00oVar.OooO00o(t, ooo00o, (i & 8) | 48 | (i & 14));
        o00Oo00.OooO0O0(oo00oVar, new OooO00o(oo00oVar), ooo00o);
        ooo00o.Oooo0o0();
        return oo00oVar;
    }
}
