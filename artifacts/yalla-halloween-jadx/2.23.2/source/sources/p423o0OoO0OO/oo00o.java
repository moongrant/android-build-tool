package p423o0OoO0OO;

import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p022Oooo00O.o00O00OO;
import p497o0o00OoO.o00000O0;
import p557o0oOOooO.oOo00ooO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextChangedExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextChangedExt.kt\ncom/yalla/yalla/ext/TextChangedExtKt$addMaskKeyAtRemoveSpace$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1855#2,2:112\n*S KotlinDebug\n*F\n+ 1 TextChangedExt.kt\ncom/yalla/yalla/ext/TextChangedExtKt$addMaskKeyAtRemoveSpace$2\n*L\n95#1:112,2\n*E\n"})
public final class oo00o extends Lambda implements Function3<CharSequence, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MessageEditText f46719OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<String, Integer, Unit> f46720OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(MessageEditText messageEditText, o00000O0 o00000o1) {
        super(3);
        this.f46719OooO0Oo = messageEditText;
        this.f46720OooO0o0 = o00000o1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(CharSequence charSequence, Integer num, Integer num2) {
        CharSequence charSequence2 = charSequence;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        if (charSequence2 != null && iIntValue2 == 1 && iIntValue > 0) {
            String string = charSequence2.subSequence(iIntValue, iIntValue2 + iIntValue).toString();
            if (Intrinsics.areEqual(string, ZegoConstants.ZegoVideoDataAuxPublishingStream)) {
                MessageEditText messageEditText = this.f46719OooO0Oo;
                if (messageEditText.getSpanManager().OooO0OO("@") > 0) {
                    ArrayList<? extends oOo00ooO> arrayListOooO0O0 = messageEditText.getSpanManager().OooO0O0("@");
                    Intrinsics.checkNotNullExpressionValue(arrayListOooO0O0, "getMaskKey(...)");
                    Iterator<? extends oOo00ooO> it = arrayListOooO0O0.iterator();
                    while (it.hasNext()) {
                        String strOooO00o = o00O00OO.OooO00o("@", it.next().f56180OooO0Oo);
                        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) charSequence2.toString(), strOooO00o, 0, false, 6, (Object) null);
                        if (strOooO00o.length() + iIndexOf$default == iIntValue) {
                            String strReplace$default = StringsKt__StringsJVMKt.replace$default(charSequence2.toString(), strOooO00o + string, "", false, 4, (Object) null);
                            Function2<String, Integer, Unit> function2 = this.f46720OooO0o0;
                            if (function2 != null) {
                                function2.invoke(strReplace$default, Integer.valueOf(iIndexOf$default));
                            }
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
