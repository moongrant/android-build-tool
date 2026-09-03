package o000OO;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooO0O0 {
    public static void OooO00o(LifecycleOwner lifecycleOwner, StringBuilder sb) {
        int iLastIndexOf;
        if (lifecycleOwner == null) {
            sb.append("null");
            return;
        }
        String simpleName = lifecycleOwner.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = lifecycleOwner.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(lifecycleOwner)));
    }
}
