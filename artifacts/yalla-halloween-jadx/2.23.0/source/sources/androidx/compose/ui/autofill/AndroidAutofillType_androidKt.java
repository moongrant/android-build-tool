package androidx.compose.ui.autofill;

import androidx.compose.ui.ExperimentalComposeUiApi;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\"2\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u00048\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\u0003*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidAutofillTypes", "Ljava/util/HashMap;", "Landroidx/compose/ui/autofill/AutofillType;", "", "Lkotlin/collections/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidType", "getAndroidType$annotations", "(Landroidx/compose/ui/autofill/AutofillType;)V", "getAndroidType", "(Landroidx/compose/ui/autofill/AutofillType;)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidAutofillType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillType.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillType_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public final class AndroidAutofillType_androidKt {

    @NotNull
    private static final HashMap<AutofillType, String> androidAutofillTypes = MapsKt.hashMapOf(TuplesKt.to(AutofillType.EmailAddress, "emailAddress"), TuplesKt.to(AutofillType.Username, "username"), TuplesKt.to(AutofillType.Password, "password"), TuplesKt.to(AutofillType.NewUsername, "newUsername"), TuplesKt.to(AutofillType.NewPassword, "newPassword"), TuplesKt.to(AutofillType.PostalAddress, "postalAddress"), TuplesKt.to(AutofillType.PostalCode, "postalCode"), TuplesKt.to(AutofillType.CreditCardNumber, "creditCardNumber"), TuplesKt.to(AutofillType.CreditCardSecurityCode, "creditCardSecurityCode"), TuplesKt.to(AutofillType.CreditCardExpirationDate, "creditCardExpirationDate"), TuplesKt.to(AutofillType.CreditCardExpirationMonth, "creditCardExpirationMonth"), TuplesKt.to(AutofillType.CreditCardExpirationYear, "creditCardExpirationYear"), TuplesKt.to(AutofillType.CreditCardExpirationDay, "creditCardExpirationDay"), TuplesKt.to(AutofillType.AddressCountry, "addressCountry"), TuplesKt.to(AutofillType.AddressRegion, "addressRegion"), TuplesKt.to(AutofillType.AddressLocality, "addressLocality"), TuplesKt.to(AutofillType.AddressStreet, "streetAddress"), TuplesKt.to(AutofillType.AddressAuxiliaryDetails, "extendedAddress"), TuplesKt.to(AutofillType.PostalCodeExtended, "extendedPostalCode"), TuplesKt.to(AutofillType.PersonFullName, "personName"), TuplesKt.to(AutofillType.PersonFirstName, "personGivenName"), TuplesKt.to(AutofillType.PersonLastName, "personFamilyName"), TuplesKt.to(AutofillType.PersonMiddleName, "personMiddleName"), TuplesKt.to(AutofillType.PersonMiddleInitial, "personMiddleInitial"), TuplesKt.to(AutofillType.PersonNamePrefix, "personNamePrefix"), TuplesKt.to(AutofillType.PersonNameSuffix, "personNameSuffix"), TuplesKt.to(AutofillType.PhoneNumber, "phoneNumber"), TuplesKt.to(AutofillType.PhoneNumberDevice, "phoneNumberDevice"), TuplesKt.to(AutofillType.PhoneCountryCode, "phoneCountryCode"), TuplesKt.to(AutofillType.PhoneNumberNational, "phoneNational"), TuplesKt.to(AutofillType.Gender, "gender"), TuplesKt.to(AutofillType.BirthDateFull, "birthDateFull"), TuplesKt.to(AutofillType.BirthDateDay, "birthDateDay"), TuplesKt.to(AutofillType.BirthDateMonth, "birthDateMonth"), TuplesKt.to(AutofillType.BirthDateYear, "birthDateYear"), TuplesKt.to(AutofillType.SmsOtpCode, "smsOTPCode"));

    @ExperimentalComposeUiApi
    private static /* synthetic */ void getAndroidAutofillTypes$annotations() {
    }

    @NotNull
    public static final String getAndroidType(@NotNull AutofillType autofillType) {
        Intrinsics.checkNotNullParameter(autofillType, "<this>");
        String str = androidAutofillTypes.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getAndroidType$annotations(AutofillType autofillType) {
    }
}
