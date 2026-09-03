package p464o0Oooo;

import android.content.SharedPreferences;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.db.table.UserInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00Ooo;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00oO extends Lambda implements Function1<List<UserInfo.TagInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oo00oO f46862OooO0Oo = new oo00oO();

    public oo00oO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo.TagInfo> list) {
        List<UserInfo.TagInfo> value = list;
        o00Ooo o00oooOooO00o = o00Oo0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(value, "it");
        o00oooOooO00o.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(ViewHierarchyConstants.TAG_KEY, "key");
        SharedPreferences.Editor editorPutString = o00oooOooO00o.f47687OooO00o.edit().putString(ViewHierarchyConstants.TAG_KEY, oOo00OO0.OooO0OO(value));
        if (editorPutString != null) {
            editorPutString.commit();
        }
        return Unit.INSTANCE;
    }
}
