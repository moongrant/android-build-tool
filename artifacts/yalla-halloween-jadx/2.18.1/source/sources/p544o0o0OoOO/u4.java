package p544o0o0OoOO;

import android.widget.EditText;
import com.yalla.yalla.ui.activity.room.MemberListConveneActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p516o0o0O000.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class u4 extends Lambda implements Function2<Integer, String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MemberListConveneActivity f44320Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(MemberListConveneActivity memberListConveneActivity) {
        super(2);
        this.f44320Oooo0o = memberListConveneActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        Integer num2 = num;
        String str2 = str;
        if (num2 != null && num2.intValue() == 3) {
            if (str2 != null && (StringsKt.isBlank(str2) ^ true)) {
                MemberListConveneActivity memberListConveneActivity = this.f44320Oooo0o;
                int i = MemberListConveneActivity.f22860o0OoOo0;
                memberListConveneActivity.Oooo00o(str2, true);
                EditText editSearch = this.f44320Oooo0o.OooOooo().f50310OooO0o0.getEditSearch();
                MemberListConveneActivity memberListConveneActivity2 = this.f44320Oooo0o;
                Objects.requireNonNull(memberListConveneActivity2);
                o00000O.OooO00o(editSearch, memberListConveneActivity2);
            }
        }
        return Unit.INSTANCE;
    }
}
