package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public final class OooOOO {
    @DoNotInline
    public static boolean OooO00o(ListView listView, int i) {
        return listView.canScrollList(i);
    }

    @DoNotInline
    public static void OooO0O0(ListView listView, int i) {
        listView.scrollListBy(i);
    }
}
