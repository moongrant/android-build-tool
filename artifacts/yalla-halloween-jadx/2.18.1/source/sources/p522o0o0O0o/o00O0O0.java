package p522o0o0O0o;

import com.app.base.framework.view.editTextSpan.MessageEditText;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import p028Oooo0o0.o00O0O0O;
import p150o00Oo0Oo.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0 extends Lambda implements Function3<CharSequence, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MessageEditText f43005Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<String, Integer, Unit> f43006Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O0O0(MessageEditText messageEditText, Function2<? super String, ? super Integer, Unit> function2) {
        super(3);
        this.f43005Oooo0o = messageEditText;
        this.f43006Oooo0oO = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(CharSequence charSequence, Integer num, Integer num2) {
        CharSequence charSequence2 = charSequence;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        if (charSequence2 != null) {
            MessageEditText messageEditText = this.f43005Oooo0o;
            Function2<String, Integer, Unit> function2 = this.f43006Oooo0oO;
            if (iIntValue2 == 1 && iIntValue > 0) {
                String string = charSequence2.subSequence(iIntValue, iIntValue2 + iIntValue).toString();
                if (Intrinsics.areEqual(string, ZegoConstants.ZegoVideoDataAuxPublishingStream) && messageEditText.getSpanManager().OooO0Oo("@") > 0) {
                    ArrayList<? extends OooOo> arrayListOooO0OO = messageEditText.getSpanManager().OooO0OO("@");
                    Intrinsics.checkNotNullExpressionValue(arrayListOooO0OO, "this.spanManager.getMask…Constant.Post_MaskKey_At)");
                    for (OooOo oooOo : arrayListOooO0OO) {
                        StringBuilder sbOooO00o = o00O0O0O.OooO00o('@');
                        sbOooO00o.append(oooOo.f32172Oooo0o);
                        String string2 = sbOooO00o.toString();
                        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) charSequence2.toString(), string2, 0, false, 6, (Object) null);
                        if (string2.length() + iIndexOf$default == iIntValue) {
                            String strOooOo00 = StringsKt.OooOo00(charSequence2.toString(), string2 + string, "");
                            if (function2 != null) {
                                function2.invoke(strOooOo00, Integer.valueOf(iIndexOf$default));
                            }
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
