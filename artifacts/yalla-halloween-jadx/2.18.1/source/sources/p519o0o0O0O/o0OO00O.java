package p519o0o0O0O;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.weieyu.yalla.R;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.Nullable;
import p611o0oo0OO0.o0000;
import p611o0oo0OO0.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0OO00O extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return R.drawable.icon_home_explore_country_fire;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return R.string.didi_kit_show_buried_point_upload;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final void onAppInit(@Nullable Context context) {
    }

    @Override // com.didichuxing.doraemonkit.kit.AbstractKit, com.didichuxing.doraemonkit.kit.IKit
    public final void onClick(@Nullable Context context) {
        o0000 o0000Var = o0000.f48362OooO00o;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o0000O00(null), 3, null);
    }
}
