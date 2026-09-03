package p487o0o00O;

import androidx.fragment.app.FragmentManager;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p586o0oOooO0.oO0o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O extends oO0o0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MainSearchActivity f48773OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(MainSearchActivity mainSearchActivity, FragmentManager fragmentManager, ArrayList arrayList) {
        super(fragmentManager, arrayList);
        this.f48773OooO = mainSearchActivity;
        Intrinsics.checkNotNull(fragmentManager);
    }

    @Override // p114o00O00o.OooO0OO
    @NotNull
    public final CharSequence OooO0o0(int i) {
        return this.f48773OooO.f24962OooOo.get(i);
    }
}
