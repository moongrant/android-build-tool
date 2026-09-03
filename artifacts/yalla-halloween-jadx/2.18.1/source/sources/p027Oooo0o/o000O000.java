package p027Oooo0o;

import androidx.compose.foundation.lazy.layout.o00Oo0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 implements o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00Oo0<o00Ooo> f1859OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final androidx.compose.foundation.lazy.layout.OooO0O0<o00Ooo> f1860OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Object f1861Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Object obj) {
            super(1);
            this.f1861Oooo0o = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            num.intValue();
            return this.f1861Oooo0o;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Object f1862Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Object obj) {
            super(1);
            this.f1862Oooo0o = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            num.intValue();
            return this.f1862Oooo0o;
        }
    }

    public static final class OooO0OO extends Lambda implements Function4<o000oOoO, Integer, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function3<o000oOoO, oOO00O, Integer, Unit> f1863Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Function3<? super o000oOoO, ? super oOO00O, ? super Integer, Unit> function3) {
            super(4);
            this.f1863Oooo0o = function3;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(o000oOoO o000oooo2, Integer num, oOO00O ooo00o, Integer num2) {
            o000oOoO $receiver = o000oooo2;
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
                this.f1863Oooo0o.invoke($receiver, ooo00o2, Integer.valueOf(iIntValue & 14));
            }
            return Unit.INSTANCE;
        }
    }

    public o000O000() {
        o00Oo0<o00Ooo> o00oo1 = new o00Oo0<>();
        this.f1859OooO00o = o00oo1;
        this.f1860OooO0O0 = o00oo1;
    }

    @Override // p027Oooo0o.o000
    public final /* synthetic */ void OooO00o(int i, Function1 function1, Function4 itemContent) {
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        OooO0OO(i, function1, o0000OO0.f1841Oooo0o, itemContent);
    }

    @Override // p027Oooo0o.o000
    public final void OooO0O0(@Nullable Object obj, @Nullable Object obj2, @NotNull Function3<? super o000oOoO, ? super oOO00O, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f1859OooO00o.OooO00o(1, new o00Ooo(obj != null ? new OooO00o(obj) : null, new OooO0O0(obj2), o00O0000.OooO0O0(-735119482, true, new OooO0OO(content))));
    }

    @Override // p027Oooo0o.o000
    public final void OooO0OO(int i, @Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super o000oOoO, ? super Integer, ? super oOO00O, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        this.f1859OooO00o.OooO00o(i, new o00Ooo(function1, contentType, itemContent));
    }
}
