package p474o0o00;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.model.user.CountryItemData;
import com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 PhoneCountryCodeSelectActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneCountryCodeSelectActivity\n*L\n1#1,97:1\n78#2:98\n71#3:99\n125#4,8:100\n*E\n"})
public final class o00O implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneCountryCodeSelectActivity f47257OooO0Oo;

    public o00O(PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity) {
        this.f47257OooO0Oo = phoneCountryCodeSelectActivity;
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
        String strOooOoO;
        o00OO000 o00oo001 = null;
        String string2 = (charSequence == null || (string = charSequence.toString()) == null || (strOooOoO = StringsKt.OooOoO(string, "+", "")) == null) ? null : StringsKt.trim((CharSequence) strOooOoO).toString();
        boolean z = string2 == null || StringsKt.isBlank(string2);
        PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity = this.f47257OooO0Oo;
        if (z) {
            o00OO000 o00oo002 = phoneCountryCodeSelectActivity.f25253OooOo;
            if (o00oo002 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00oo002 = null;
            }
            o00oo002.OooOoO0(phoneCountryCodeSelectActivity.f25256OooOo0O);
        } else {
            o00OO000 o00oo003 = phoneCountryCodeSelectActivity.f25253OooOo;
            if (o00oo003 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00oo003 = null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = phoneCountryCodeSelectActivity.f25256OooOo0O;
            int size = arrayList2.size();
            for (int i4 = phoneCountryCodeSelectActivity.f25257OooOo0o; i4 < size; i4++) {
                if (StringsKt__StringsKt.contains(((CountryItemData) arrayList2.get(i4)).getCountryCode(), string2, true) || StringsKt__StringsKt.contains(((CountryItemData) arrayList2.get(i4)).getCountryName(), string2, true)) {
                    arrayList.add(arrayList2.get(i4));
                }
            }
            o00oo003.OooOoO0(arrayList);
        }
        o00OO000 o00oo004 = phoneCountryCodeSelectActivity.f25253OooOo;
        if (o00oo004 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o00oo001 = o00oo004;
        }
        o00oo001.Oooo0O0(true);
    }
}
