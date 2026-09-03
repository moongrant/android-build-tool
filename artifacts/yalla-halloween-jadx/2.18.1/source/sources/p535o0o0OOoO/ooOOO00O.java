package p535o0o0OOoO;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p462o0Ooo0o.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class ooOOO00O extends o0000O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MainSearchActivity f43733OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOO00O(MainSearchActivity mainSearchActivity, FragmentManager supportFragmentManager, List<Fragment> list) {
        super(supportFragmentManager, list);
        this.f43733OooO = mainSearchActivity;
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
    }

    @Override // p105o000oo0o.o00Ooo
    @Nullable
    public final CharSequence OooO0o0(int i) {
        return o000O0O0.OooO0OO(this.f43733OooO.f21973OooooOo[i]);
    }
}
