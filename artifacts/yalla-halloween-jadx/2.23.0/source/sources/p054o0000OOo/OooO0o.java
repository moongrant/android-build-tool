package p054o0000OOo;

import android.view.View;
import androidx.core.view.o000O0o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "PoolingContainer")
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f34137OooO00o = OooOO0O.pooling_container_listener_holder_tag;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f34138OooO0O0 = OooOO0O.is_pooling_container_tag;

    public static final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view, "<this>");
        Iterator it = SequencesKt.sequence(new o000O0o(view, null)).iterator();
        while (it.hasNext()) {
            ArrayList<OooO> arrayList = OooO0O0((View) it.next()).f34139OooO00o;
            for (int lastIndex = CollectionsKt.getLastIndex(arrayList); -1 < lastIndex; lastIndex--) {
                arrayList.get(lastIndex).onRelease();
            }
        }
    }

    public static final OooOO0 OooO0O0(View view) {
        int i = f34137OooO00o;
        OooOO0 oooOO1 = (OooOO0) view.getTag(i);
        if (oooOO1 != null) {
            return oooOO1;
        }
        OooOO0 oooOO2 = new OooOO0();
        view.setTag(i, oooOO2);
        return oooOO2;
    }
}
