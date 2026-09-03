package p506o0o00oOo;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0000Ooo;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0Oo00 extends o0000Ooo {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50532OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0Oo00(UserInfoActivity userInfoActivity, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.f50532OooO0oo = userInfoActivity;
    }

    @Override // p114o00O00o.OooO0OO
    public final int OooO0OO() {
        ArrayList arrayList = this.f50532OooO0oo.f26783OooOoO0;
        if (arrayList == null) {
            return 0;
        }
        Intrinsics.checkNotNull(arrayList);
        return arrayList.size();
    }

    @Override // p114o00O00o.OooO0OO
    @Nullable
    public final CharSequence OooO0o0(int i) {
        return o0000.OooO0OO(this.f50532OooO0oo.f26784OooOoOO[i]);
    }

    @Override // androidx.fragment.app.o0000Ooo
    @NotNull
    public final Fragment OooOOo0(int i) {
        ArrayList arrayList = this.f50532OooO0oo.f26783OooOoO0;
        Intrinsics.checkNotNull(arrayList);
        return (Fragment) arrayList.get(i);
    }
}
