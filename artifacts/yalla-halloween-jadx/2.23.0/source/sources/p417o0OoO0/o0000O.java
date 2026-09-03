package p417o0OoO0;

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
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import p022Oooo00O.o00O00OO;
import p490o0o00OOO.OooOO0;
import p585o0oOooOO.h;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextChangedExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextChangedExt.kt\ncom/yalla/yalla/ext/TextChangedExtKt$addMaskKeyAtRemoveSpace$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1855#2,2:112\n*S KotlinDebug\n*F\n+ 1 TextChangedExt.kt\ncom/yalla/yalla/ext/TextChangedExtKt$addMaskKeyAtRemoveSpace$2\n*L\n95#1:112,2\n*E\n"})
public final class o0000O extends Lambda implements Function3<CharSequence, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MessageEditText f45492OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<String, Integer, Unit> f45493OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(MessageEditText messageEditText, OooOO0 oooOO1) {
        super(3);
        this.f45492OooO0Oo = messageEditText;
        this.f45493OooO0o0 = oooOO1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(CharSequence charSequence, Integer num, Integer num2) {
        CharSequence charSequence2 = charSequence;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        if (charSequence2 != null && iIntValue2 == 1 && iIntValue > 0) {
            String string = charSequence2.subSequence(iIntValue, iIntValue2 + iIntValue).toString();
            if (Intrinsics.areEqual(string, ZegoConstants.ZegoVideoDataAuxPublishingStream)) {
                MessageEditText messageEditText = this.f45492OooO0Oo;
                if (messageEditText.getSpanManager().OooO0OO("@") > 0) {
                    ArrayList<? extends h> arrayListOooO0O0 = messageEditText.getSpanManager().OooO0O0("@");
                    Intrinsics.checkNotNullExpressionValue(arrayListOooO0O0, "this.spanManager.getMask…Constant.Post_MaskKey_At)");
                    Iterator<? extends h> it = arrayListOooO0O0.iterator();
                    while (it.hasNext()) {
                        String strOooO00o = o00O00OO.OooO00o("@", it.next().f56769OooO0Oo);
                        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) charSequence2.toString(), strOooO00o, 0, false, 6, (Object) null);
                        if (strOooO00o.length() + iIndexOf$default == iIntValue) {
                            String strOooOoO = StringsKt.OooOoO(charSequence2.toString(), strOooO00o + string, "");
                            Function2<String, Integer, Unit> function2 = this.f45493OooO0o0;
                            if (function2 != null) {
                                function2.invoke(strOooOoO, Integer.valueOf(iIndexOf$default));
                            }
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
