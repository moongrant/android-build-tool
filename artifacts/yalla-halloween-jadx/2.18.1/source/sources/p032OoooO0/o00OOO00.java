package p032OoooO0;

import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyCommand;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o00000O.o0OO00O;
import p034OoooO0O.o0000Ooo;
import p054o00000oo.o000O0Oo;
import p054o00000oo.oo0oOO0;
import p650o0ooOoO.f;
import p650o0ooOoO.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOO00 extends FunctionReferenceImpl implements Function1<f, Boolean> {
    public o00OOO00(Object obj) {
        super(1, obj, o00OO.class, UMModuleRegister.PROCESS, "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(f fVar) {
        o000O0Oo o000o0oo2;
        KeyCommand keyCommandOooO00o;
        KeyEvent utf16CodePoint = fVar.f51138OooO00o;
        Intrinsics.checkNotNullParameter(utf16CodePoint, "p0");
        o00OO o00oo2 = (o00OO) this.receiver;
        Objects.requireNonNull(o00oo2);
        Intrinsics.checkNotNullParameter(utf16CodePoint, "event");
        Intrinsics.checkNotNullParameter(utf16CodePoint, "$this$isTypedEvent");
        boolean z = false;
        if (utf16CodePoint.getAction() == 0 && utf16CodePoint.getUnicodeChar() != 0) {
            StringBuilder sb = new StringBuilder();
            Intrinsics.checkNotNullParameter(utf16CodePoint, "$this$utf16CodePoint");
            int unicodeChar = utf16CodePoint.getUnicodeChar();
            Intrinsics.checkNotNullParameter(sb, "<this>");
            StringBuilder appendCodePointX = sb.appendCodePoint(unicodeChar);
            Intrinsics.checkNotNullExpressionValue(appendCodePointX, "appendCodePointX");
            String string = appendCodePointX.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().appendCo…              .toString()");
            o000o0oo2 = new o000O0Oo(string, 1);
        } else {
            o000o0oo2 = null;
        }
        if (o000o0oo2 == null) {
            if ((g.OooO0O0(utf16CodePoint) == 2) && (keyCommandOooO00o = o00oo2.f3177OooO.OooO00o(utf16CodePoint)) != null && (!keyCommandOooO00o.getEditsText() || o00oo2.f3181OooO0Oo)) {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                oo0O oo0o = new oo0O(keyCommandOooO00o, o00oo2, booleanRef);
                o0000Ooo o0000ooo = new o0000Ooo(o00oo2.f3180OooO0OO, o00oo2.f3184OooO0oO, o00oo2.f3178OooO00o.OooO0OO(), o00oo2.f3182OooO0o);
                oo0o.invoke(o0000ooo);
                if (!o0OO00O.OooO0O0(o0000ooo.f3564OooO0o, o00oo2.f3180OooO0OO.f27237OooO0O0) || !Intrinsics.areEqual(o0000ooo.f3566OooO0oO, o00oo2.f3180OooO0OO.f27236OooO00o)) {
                    o00oo2.f3186OooOO0.invoke(oo0oOO0.OooO00o(o0000ooo.f3504OooO0oo, o0000ooo.f3566OooO0oO, o0000ooo.f3564OooO0o, 4));
                }
                o0OoOoOo o0oooooo2 = o00oo2.f3185OooO0oo;
                if (o0oooooo2 != null) {
                    o0oooooo2.f3375OooO0o = true;
                }
                z = booleanRef.element;
            }
        } else if (o00oo2.f3181OooO0Oo) {
            o00oo2.OooO00o(CollectionsKt.listOf(o000o0oo2));
            o00oo2.f3182OooO0o.f3530OooO00o = null;
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
