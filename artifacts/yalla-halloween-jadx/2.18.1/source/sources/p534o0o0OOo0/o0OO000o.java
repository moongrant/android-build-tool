package p534o0o0OOo0;

import android.text.Editable;
import android.text.TextWatcher;
import com.app.base.model.CountryCodeItemModel;
import com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;
import p188o00o00o0.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO000o implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PhoneCountryCodeSelectActivity f43571Oooo0o;

    public o0OO000o(PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity) {
        this.f43571Oooo0o = phoneCountryCodeSelectActivity;
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
        String strOooOo00;
        OooO0OO<CountryCodeItemModel> oooO0OO = null;
        String string2 = (charSequence == null || (string = charSequence.toString()) == null || (strOooOo00 = StringsKt.OooOo00(string, "+", "")) == null) ? null : StringsKt.trim((CharSequence) strOooOo00).toString();
        if (string2 == null || StringsKt.isBlank(string2)) {
            OooO0OO<CountryCodeItemModel> oooO0OO2 = this.f43571Oooo0o.f21815Oooooo0;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO2 = null;
            }
            oooO0OO2.setNewData(this.f43571Oooo0o.OooOooO());
        } else {
            OooO0OO<CountryCodeItemModel> oooO0OO3 = this.f43571Oooo0o.f21815Oooooo0;
            if (oooO0OO3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO3 = null;
            }
            PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity = this.f43571Oooo0o;
            Objects.requireNonNull(phoneCountryCodeSelectActivity);
            ArrayList arrayList = new ArrayList();
            int size = phoneCountryCodeSelectActivity.OooOooO().size();
            for (int i4 = phoneCountryCodeSelectActivity.f21814OooooOo; i4 < size; i4++) {
                if (StringsKt__StringsKt.contains(phoneCountryCodeSelectActivity.OooOooO().get(i4).getCountryCode(), string2, true) || StringsKt__StringsKt.contains(phoneCountryCodeSelectActivity.OooOooO().get(i4).getName(), string2, true)) {
                    arrayList.add(phoneCountryCodeSelectActivity.OooOooO().get(i4));
                }
            }
            oooO0OO3.setNewData(arrayList);
        }
        OooO0OO<CountryCodeItemModel> oooO0OO4 = this.f43571Oooo0o.f21815Oooooo0;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO = oooO0OO4;
        }
        oooO0OO.setLoadComplete(true);
    }
}
