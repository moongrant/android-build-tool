package p488o0o00O0o;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.model.moment.MomentType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentSendImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendImage.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSelectMediaUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1855#2,2:355\n*S KotlinDebug\n*F\n+ 1 MomentSendImage.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSelectMediaUtil\n*L\n340#1:355,2\n*E\n"})
public final class o0ooOOo {
    @JvmStatic
    public static final void OooO00o(@Nullable ArrayList arrayList, @NotNull Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MomentSelectMedia momentSelectMedia = (MomentSelectMedia) it.next();
                if (momentSelectMedia.getDuration() > 0) {
                    listener.invoke(MomentType.Video);
                    return;
                } else {
                    if (momentSelectMedia.getPath().length() > 0) {
                        listener.invoke(MomentType.Image);
                        return;
                    }
                }
            }
        }
        listener.invoke(MomentType.Text);
    }
}
