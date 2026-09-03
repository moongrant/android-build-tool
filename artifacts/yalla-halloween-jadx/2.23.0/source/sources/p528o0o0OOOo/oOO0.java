package p528o0o0OOOo;

import android.media.MediaPlayer;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O0;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p351o0OOOo0O.OooO;
import p579o0oOoo.oOo00ooO;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMusicControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicControl.kt\ncom/yalla/yalla/ui/screen/moment/media/MusicControl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,250:1\n1864#2,3:251\n*S KotlinDebug\n*F\n+ 1 MusicControl.kt\ncom/yalla/yalla/ui/screen/moment/media/MusicControl\n*L\n226#1:251,3\n*E\n"})
public final class oOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f54098OooO00o = true;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static MusicTable f54099OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static boolean f54100OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static boolean f54102OooO0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final MediaPlayer f54101OooO0Oo = new MediaPlayer();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static int f54103OooO0o0 = 30;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f54104OooO0oO = LazyKt.lazy(OooO00o.f54105OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<Observer<List<MusicTable>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54105OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Observer<List<MusicTable>> invoke() {
            return ooooO000.f54416OooO0Oo;
        }
    }

    public static void OooO() {
        MusicState.f22836OooO0O0.postValue(MusicState.State.Stop);
        OooO.OooO0O0().OooO00o().OooOo00();
    }

    public static void OooO00o(@NotNull List musicList) {
        MusicTable musicTable;
        Intrinsics.checkNotNullParameter(musicList, "deleteList");
        List<MusicTable> musicList2 = (List) MusicState.OooO00o().getValue();
        if (musicList2 == null) {
            return;
        }
        if (musicList2.size() == musicList.size()) {
            OooO();
            Intrinsics.checkNotNullParameter(musicList2, "musicList");
            o000OOo.OooO00o().OooOo().OooO0o0(musicList2);
            MusicState.f22835OooO00o.postValue(null);
            return;
        }
        int iIndexOf = CollectionsKt.indexOf((List<? extends MusicTable>) musicList2, MusicState.f22835OooO00o.getValue());
        int i = 0;
        for (Object obj : musicList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIndexOf2 = musicList2.indexOf((MusicTable) obj);
            if (iIndexOf2 == iIndexOf) {
                int i3 = iIndexOf;
                do {
                    i3++;
                    if (i3 >= musicList2.size()) {
                        i3 = 0;
                    }
                    musicTable = musicList2.get(i3);
                    f54099OooO0O0 = musicTable;
                    Intrinsics.checkNotNull(musicTable);
                } while (musicList.indexOf(musicTable) >= 0);
            }
            if ((f54099OooO0O0 == null) && iIndexOf2 == iIndexOf + 1) {
                f54100OooO0OO = true;
            }
            i = i2;
        }
        f54098OooO00o = true;
        MusicState.OooO00o().observeForever((Observer) f54104OooO0oO.getValue());
        Intrinsics.checkNotNullParameter(musicList, "musicList");
        o000OOo.OooO00o().OooOo().OooO0o0(musicList);
    }

    @Nullable
    public static MusicTable OooO0O0() {
        List list;
        int iIndexOf;
        try {
            MusicTable value = MusicState.f22835OooO00o.getValue();
            if (value != null && (list = (List) MusicState.OooO00o().getValue()) != null && (iIndexOf = list.indexOf(value)) >= 0 && iIndexOf < list.size() - 1) {
                return (MusicTable) list.get(iIndexOf + 1);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void OooO0OO(@NotNull String mPath) {
        Intrinsics.checkNotNullParameter(mPath, "mPath");
        Uri uriOooO00o = oOo00ooO.OooO00o(mPath);
        MediaPlayer mediaPlayer = f54101OooO0Oo;
        if (mediaPlayer.isPlaying()) {
            return;
        }
        try {
            mediaPlayer.reset();
            mediaPlayer.setDataSource(o000O0.OooO00o(), uriOooO00o);
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.prepareAsync();
        mediaPlayer.setOnPreparedListener(new oOO00OO());
    }

    public static void OooO0Oo(boolean z) {
        MutableLiveData<MusicState.State> mutableLiveData = MusicState.f22836OooO0O0;
        if (mutableLiveData.getValue() == MusicState.State.Playing) {
            f54102OooO0o = z;
            OooO.OooO0O0().OooO00o().OooO0OO();
            mutableLiveData.postValue(MusicState.State.Pause);
        }
    }

    public static /* synthetic */ void OooO0o(MusicTable musicTable, int i) {
        if ((i & 1) != 0) {
            musicTable = null;
        }
        OooO0o0(musicTable, false);
    }

    public static void OooO0o0(@Nullable MusicTable musicTable, boolean z) {
        List list = (List) MusicState.OooO00o().getValue();
        if (list == null) {
            return;
        }
        if (musicTable == null) {
            try {
                musicTable = MusicState.f22835OooO00o.getValue();
                if (musicTable == null) {
                    musicTable = (MusicTable) list.get(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (z) {
            String str = musicTable.mPath;
            Intrinsics.checkNotNullExpressionValue(str, "needPlayMusic.mPath");
            OooO0OO(str);
        } else {
            OooO.OooO0O0().OooO00o().OooOO0o(oOo00ooO.OooO00o(musicTable.mPath).toString());
            OooO.OooO0O0().OooO00o().OooOO0O(f54103OooO0o0);
        }
        MusicState.f22835OooO00o.postValue(musicTable);
        MusicState.f22836OooO0O0.postValue(MusicState.State.Playing);
    }

    public static void OooO0oO() {
        List list = (List) MusicState.OooO00o().getValue();
        if (list == null) {
            return;
        }
        MusicTable musicTableOooO0O0 = OooO0O0();
        if (musicTableOooO0O0 == null) {
            musicTableOooO0O0 = (MusicTable) list.get(0);
        }
        if (musicTableOooO0O0 != null) {
            OooO0o(musicTableOooO0O0, 2);
        }
    }

    public static void OooO0oo(boolean z) {
        MutableLiveData<MusicState.State> mutableLiveData = MusicState.f22836OooO0O0;
        if (mutableLiveData.getValue() != MusicState.State.Pause) {
            return;
        }
        if (!z || f54102OooO0o) {
            System.currentTimeMillis();
            OooO.OooO0O0().OooO00o().OooO0oo();
            mutableLiveData.setValue(MusicState.State.Playing);
        }
    }
}
