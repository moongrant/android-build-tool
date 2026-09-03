package p584o0oOoo0O;

import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.model.MusicFileModel;
import com.yalla.yalla.util.Player.Audio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o0OoOo0;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentMusicVM$addMusicList$1", f = "MomentMusicVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMomentMusicVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentMusicVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentMusicVM$addMusicList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n1855#2:161\n766#2:162\n857#2,2:163\n1856#2:165\n1549#2:166\n1620#2,3:167\n*S KotlinDebug\n*F\n+ 1 MomentMusicVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentMusicVM$addMusicList$1\n*L\n116#1:161\n117#1:162\n117#1:163,2\n116#1:165\n120#1:166\n120#1:167,3\n*E\n"})
public final class o00O0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<MusicFileModel> f56693OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(List<MusicFileModel> list, Continuation<? super o00O0OO> continuation) {
        super(2, continuation);
        this.f56693OooO0Oo = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0OO(this.f56693OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList<Audio> arrayList = new ArrayList();
        Iterator<T> it = this.f56693OooO0Oo.iterator();
        while (it.hasNext()) {
            List<Audio> songList = ((MusicFileModel) it.next()).getSongList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : songList) {
                if (((Audio) obj2).isSelected) {
                    arrayList2.add(obj2);
                }
            }
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
        for (Audio audio : arrayList) {
            MusicTable musicTable = new MusicTable();
            musicTable.mTitle = audio.getTitle();
            musicTable.mTitleKey = audio.getTitleKey();
            musicTable.mArtist = audio.getArtist();
            musicTable.mArtistKey = audio.getArtistKey();
            musicTable.mComposer = audio.getComposer();
            musicTable.mAlbum = audio.getAlbum();
            musicTable.mAlbumKey = audio.getAlbumKey();
            musicTable.mDisplayName = audio.getDisplayName();
            musicTable.mMimeType = audio.getMimeType();
            musicTable.mPath = audio.getPath();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            musicTable.user = o0OoOo0.OooO00o();
            musicTable.mDuration = audio.getDuration();
            arrayList3.add(musicTable);
        }
        o00Oo0.OooO00o().OooOoO0().OooO0OO(arrayList3);
        return Unit.INSTANCE;
    }
}
