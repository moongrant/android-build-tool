package p491o0o00O0o;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.model.user.CountryItemData;
import com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 PhoneCountryCodeSelectActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneCountryCodeSelectActivity\n*L\n1#1,97:1\n78#2:98\n71#3:99\n125#4,8:100\n*E\n"})
public final class o0O00o0 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneCountryCodeSelectActivity f49014OooO0Oo;

    public o0O00o0(PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity) {
        this.f49014OooO0Oo = phoneCountryCodeSelectActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        String string;
        String strReplace$default;
        oo00oO oo00oo = null;
        String string2 = (charSequence == null || (string = charSequence.toString()) == null || (strReplace$default = StringsKt__StringsJVMKt.replace$default(string, "+", "", false, 4, (Object) null)) == null) ? null : StringsKt.trim((CharSequence) strReplace$default).toString();
        boolean z = string2 == null || StringsKt.isBlank(string2);
        PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity = this.f49014OooO0Oo;
        if (z) {
            oo00oO oo00oo2 = phoneCountryCodeSelectActivity.f24798OooOo;
            if (oo00oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oo00oo2 = null;
            }
            oo00oo2.OooOoO0(phoneCountryCodeSelectActivity.f24801OooOo0O);
        } else {
            oo00oO oo00oo3 = phoneCountryCodeSelectActivity.f24798OooOo;
            if (oo00oo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oo00oo3 = null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = phoneCountryCodeSelectActivity.f24801OooOo0O;
            int size = arrayList2.size();
            for (int i4 = phoneCountryCodeSelectActivity.f24802OooOo0o; i4 < size; i4++) {
                if (StringsKt__StringsKt.contains(((CountryItemData) arrayList2.get(i4)).getCountryCode(), string2, true) || StringsKt__StringsKt.contains(((CountryItemData) arrayList2.get(i4)).getCountryName(), string2, true)) {
                    arrayList.add(arrayList2.get(i4));
                }
            }
            oo00oo3.OooOoO0(arrayList);
        }
        oo00oO oo00oo4 = phoneCountryCodeSelectActivity.f24798OooOo;
        if (oo00oo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oo00oo = oo00oo4;
        }
        oo00oo.Oooo0O0(true);
    }
}
