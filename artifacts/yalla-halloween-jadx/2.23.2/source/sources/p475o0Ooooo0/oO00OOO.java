package p475o0Ooooo0;

import android.content.SharedPreferences;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.db.table.UserInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p414o0Oo0oO.oO000O0;
import p415o0Oo0oO0.o00Ooo;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOO extends Lambda implements Function1<List<UserInfo.TagInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO00OOO f48090OooO0Oo = new oO00OOO();

    public oO00OOO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo.TagInfo> list) {
        List<UserInfo.TagInfo> value = list;
        oO000O0 oo000o0OooO00o = o00Ooo.OooO00o();
        Intrinsics.checkNotNull(value);
        oo000o0OooO00o.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(ViewHierarchyConstants.TAG_KEY, "key");
        SharedPreferences.Editor editorPutString = oo000o0OooO00o.f48376OooO00o.edit().putString(ViewHierarchyConstants.TAG_KEY, oOOO00.OooO0OO(value));
        if (editorPutString != null) {
            editorPutString.commit();
        }
        return Unit.INSTANCE;
    }
}
