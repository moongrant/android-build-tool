package p152o00Oo0o0;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.app.base.framework.view.textView.ViewLocation;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo00 {

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32191OooO00o;

        static {
            int[] iArr = new int[ViewLocation.values().length];
            f32191OooO00o = iArr;
            try {
                iArr[ViewLocation.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32191OooO00o[ViewLocation.end.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void OooO00o(TextView textView, Drawable drawable, ViewLocation viewLocation, boolean z) {
        if (textView == null) {
            return;
        }
        textView.setCompoundDrawables(null, null, null, null);
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        if (z) {
            int i = OooO00o.f32191OooO00o[viewLocation.ordinal()];
            if (i == 1) {
                viewLocation = ViewLocation.end;
            } else if (i == 2) {
                viewLocation = ViewLocation.start;
            }
        }
        if (viewLocation == ViewLocation.start) {
            textView.setCompoundDrawables(drawable, null, null, null);
        }
        if (viewLocation == ViewLocation.top) {
            textView.setCompoundDrawables(null, drawable, null, null);
        }
        if (viewLocation == ViewLocation.end) {
            textView.setCompoundDrawables(null, null, drawable, null);
        }
        if (viewLocation == ViewLocation.bottom) {
            textView.setCompoundDrawables(null, null, null, drawable);
        }
    }

    public static void OooO0O0(TextView textView, Drawable drawable, String str, ViewLocation viewLocation, boolean z) {
        textView.setText("");
        textView.setCompoundDrawables(null, null, null, null);
        if (!TextUtils.isEmpty(str)) {
            textView.setVisibility(0);
            textView.setText(str);
        }
        if (drawable == null) {
            textView.setCompoundDrawables(null, null, null, null);
            return;
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        textView.setVisibility(0);
        if (z) {
            int i = OooO00o.f32191OooO00o[viewLocation.ordinal()];
            if (i == 1) {
                viewLocation = ViewLocation.end;
            } else if (i == 2) {
                viewLocation = ViewLocation.start;
            }
        }
        if (viewLocation == ViewLocation.start) {
            textView.setCompoundDrawables(drawable, null, null, null);
        }
        if (viewLocation == ViewLocation.top) {
            textView.setCompoundDrawables(null, drawable, null, null);
        }
        if (viewLocation == ViewLocation.end) {
            textView.setCompoundDrawables(null, null, drawable, null);
        }
        if (viewLocation == ViewLocation.bottom) {
            textView.setCompoundDrawables(null, null, null, drawable);
        }
    }
}
