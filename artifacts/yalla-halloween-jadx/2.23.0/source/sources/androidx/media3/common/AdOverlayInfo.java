package androidx.media3.common;

import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f6137OooO00o;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Purpose {
    }

    @UnstableApi
    @Deprecated
    public AdOverlayInfo(FrameLayout frameLayout) {
        this.f6137OooO00o = frameLayout;
    }
}
