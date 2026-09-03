package o0OOo000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nVideoPlayerPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerPool.kt\ncom/yalla/android/videoplayer/exoplayer/VideoPlayerPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1855#2,2:107\n*S KotlinDebug\n*F\n+ 1 VideoPlayerPool.kt\ncom/yalla/android/videoplayer/exoplayer/VideoPlayerPool\n*L\n56#1:107,2\n*E\n"})
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<OooO0OO> f43866OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o000OO.OooOO0O<OooO0OO> f43867OooO0O0;

    static {
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            arrayList.add(new OooO0O0(o000O0.OooO00o()));
        }
        f43866OooO00o = Collections.synchronizedList(arrayList);
        f43867OooO0O0 = new o000OO.OooOO0O<>(6);
    }
}
