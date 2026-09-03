package p535o0o0Oo0;

import android.media.MediaPlayer;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O00O;
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
import p355o0OOOo0o.OooO0o;
import p408o0Oo0Oo0.o00Oo0;
import p590o0oOooo0.O0OO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMusicControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicControl.kt\ncom/yalla/yalla/ui/screen/moment/media/MusicControl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1864#2,3:253\n*S KotlinDebug\n*F\n+ 1 MusicControl.kt\ncom/yalla/yalla/ui/screen/moment/media/MusicControl\n*L\n226#1:253,3\n*E\n"})
public final class oO0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f53970OooO00o = true;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static MusicTable f53971OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static boolean f53972OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static boolean f53974OooO0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final MediaPlayer f53973OooO0Oo = new MediaPlayer();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static int f53975OooO0o0 = 30;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f53976OooO0oO = LazyKt.lazy(OooO00o.f53977OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<Observer<List<MusicTable>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53977OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Observer<List<MusicTable>> invoke() {
            return new oO0O000o();
        }
    }

    public static void OooO() {
        MusicState.f22363OooO0O0.postValue(MusicState.State.Stop);
        OooO0o.OooO0O0().OooO00o().OooOo0();
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
            o00Oo0.OooO00o().OooOoO0().OooO0o0(musicList2);
            MusicState.f22362OooO00o.postValue(null);
            return;
        }
        int iIndexOf = CollectionsKt.indexOf((List<? extends MusicTable>) musicList2, MusicState.f22362OooO00o.getValue());
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
                    if (musicList2.size() > i3) {
                        f53971OooO0O0 = musicList2.get(i3);
                    }
                    musicTable = f53971OooO0O0;
                    if (musicTable == null) {
                        break;
                    }
                } while (CollectionsKt.indexOf((List<? extends MusicTable>) musicList, musicTable) >= 0);
            }
            if ((f53971OooO0O0 == null) && iIndexOf2 == iIndexOf + 1) {
                f53972OooO0OO = true;
            }
            i = i2;
        }
        f53970OooO00o = true;
        MusicState.OooO00o().observeForever((Observer) f53976OooO0oO.getValue());
        Intrinsics.checkNotNullParameter(musicList, "musicList");
        o00Oo0.OooO00o().OooOoO0().OooO0o0(musicList);
    }

    @Nullable
    public static MusicTable OooO0O0() {
        List list;
        int iIndexOf;
        try {
            MusicTable value = MusicState.f22362OooO00o.getValue();
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
        Uri uriOooO00o = O0OO00.OooO00o(mPath);
        MediaPlayer mediaPlayer = f53973OooO0Oo;
        if (mediaPlayer.isPlaying()) {
            return;
        }
        try {
            mediaPlayer.reset();
            mediaPlayer.setDataSource(o000O00O.OooO00o(), uriOooO00o);
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.prepareAsync();
        mediaPlayer.setOnPreparedListener(new oO0O000());
    }

    public static void OooO0Oo(boolean z) {
        MutableLiveData<MusicState.State> mutableLiveData = MusicState.f22363OooO0O0;
        if (mutableLiveData.getValue() == MusicState.State.Playing) {
            f53974OooO0o = z;
            OooO0o.OooO0O0().OooO00o().OooO0OO();
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
                musicTable = MusicState.f22362OooO00o.getValue();
                if (musicTable == null) {
                    musicTable = (MusicTable) list.get(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (z) {
            String mPath = musicTable.mPath;
            Intrinsics.checkNotNullExpressionValue(mPath, "mPath");
            OooO0OO(mPath);
        } else {
            OooO0o.OooO0O0().OooO00o().OooOOO0(O0OO00.OooO00o(musicTable.mPath).toString());
            OooO0o.OooO0O0().OooO00o().OooOO0o(f53975OooO0o0);
        }
        MusicState.f22362OooO00o.postValue(musicTable);
        MusicState.f22363OooO0O0.postValue(MusicState.State.Playing);
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
        MutableLiveData<MusicState.State> mutableLiveData = MusicState.f22363OooO0O0;
        if (mutableLiveData.getValue() != MusicState.State.Pause) {
            return;
        }
        if (!z || f53974OooO0o) {
            System.currentTimeMillis();
            OooO0o.OooO0O0().OooO00o().OooO0oo();
            mutableLiveData.setValue(MusicState.State.Playing);
        }
    }
}
