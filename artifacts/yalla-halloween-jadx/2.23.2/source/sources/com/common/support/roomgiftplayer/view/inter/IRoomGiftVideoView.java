package com.common.support.roomgiftplayer.view.inter;

import android.view.View;
import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import com.common.support.roomgiftplayer.VideoModel;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0005H'J\b\u0010\u0010\u001a\u00020\u0005H'J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\tH'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/common/support/roomgiftplayer/view/inter/IRoomGiftVideoView;", "", "getView", "Landroid/view/View;", "init", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "play", "", "localFile", "Ljava/io/File;", "videoModel", "Lcom/common/support/roomgiftplayer/VideoModel;", "(Ljava/io/File;Lcom/common/support/roomgiftplayer/VideoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "release", "reset", "showVisible", "visible", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IRoomGiftVideoView {
    @NotNull
    View getView();

    void init(@NotNull AppCompatActivity activity);

    @Nullable
    Object play(@NotNull File file, @NotNull VideoModel videoModel, @NotNull Continuation<? super Boolean> continuation);

    @MainThread
    void release();

    @MainThread
    void reset();

    @MainThread
    void showVisible(boolean visible);
}
