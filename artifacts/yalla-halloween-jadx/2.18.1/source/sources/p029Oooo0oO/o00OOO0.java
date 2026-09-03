package p029Oooo0oO;

import androidx.compose.foundation.lazy.layout.o00Oo0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0 implements o00OOO00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f2351OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00Oo0<o00> f2350OooO00o = new o00Oo0<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Function2<o00O0O00, Integer, o000OO0O> f2352OooO0OO = OooO00o.f2354Oooo0o;

    public static final class OooO extends Lambda implements Function4<oo00o, Integer, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function3<oo00o, oOO00O, Integer, Unit> f2353Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(Function3<? super oo00o, ? super oOO00O, ? super Integer, Unit> function3) {
            super(4);
            this.f2353Oooo0o = function3;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(oo00o oo00oVar, Integer num, oOO00O ooo00o, Integer num2) {
            oo00o $receiver = oo00oVar;
            num.intValue();
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num2.intValue();
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            if ((iIntValue & 14) == 0) {
                iIntValue |= ooo00o2.Oooo0oo($receiver) ? 4 : 2;
            }
            if ((iIntValue & 651) == 130 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                this.f2353Oooo0o.invoke($receiver, ooo00o2, Integer.valueOf(iIntValue & 14));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<o00O0O00, Integer, o000OO0O> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f2354Oooo0o = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final o000OO0O invoke(o00O0O00 o00o0o01, Integer num) {
            num.intValue();
            Intrinsics.checkNotNullParameter(o00o0o01, "$this$null");
            return new o000OO0O(1);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Object f2355Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Object obj) {
            super(1);
            this.f2355Oooo0o = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            num.intValue();
            return this.f2355Oooo0o;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<o00O0O00, Integer, o000OO0O> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<o00O0O00, o000OO0O> f2356Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Function1<? super o00O0O00, o000OO0O> function1) {
            super(2);
            this.f2356Oooo0o = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final o000OO0O invoke(o00O0O00 o00o0o01, Integer num) {
            o00O0O00 o00o0o02 = o00o0o01;
            num.intValue();
            Intrinsics.checkNotNullParameter(o00o0o02, "$this$null");
            return new o000OO0O(this.f2356Oooo0o.invoke(o00o0o02).f2271OooO00o);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Object f2357Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Object obj) {
            super(1);
            this.f2357Oooo0o = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            num.intValue();
            return this.f2357Oooo0o;
        }
    }

    @Override // p029Oooo0oO.o00OOO00
    public final void OooO00o(@Nullable Object obj, @Nullable Function1<? super o00O0O00, o000OO0O> function1, @Nullable Object obj2, @NotNull Function3<? super oo00o, ? super oOO00O, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f2350OooO00o.OooO00o(1, new o00(obj != null ? new OooO0O0(obj) : null, function1 != null ? new OooO0OO(function1) : this.f2352OooO0OO, new OooO0o(obj2), o00O0000.OooO0O0(-1504808184, true, new OooO(content))));
        if (function1 != null) {
            this.f2351OooO0O0 = true;
        }
    }

    @Override // p029Oooo0oO.o00OOO00
    public final void OooO0O0(int i, @Nullable Function1<? super Integer, ? extends Object> function1, @Nullable Function2<? super o00O0O00, ? super Integer, o000OO0O> function2, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super oo00o, ? super Integer, ? super oOO00O, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        this.f2350OooO00o.OooO00o(i, new o00(function1, function2 == null ? this.f2352OooO0OO : function2, contentType, itemContent));
        if (function2 != null) {
            this.f2351OooO0O0 = true;
        }
    }
}
