package com.yalla.yalla.module.media;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.module_service.BaseModuleServiceInitializer;
import com.yalla.yalla.module.media.music.MusicAddScreen;
import com.yalla.yalla.module.media.music.MusicEditScreen;
import com.yalla.yalla.module.media.music.MusicScreen;
import com.yalla.yalla.module.media.preview.YLMediaPreViewScreen;
import com.yalla.yalla.module.media.test.MediaTestScreen;
import kotlin.Metadata;
import o000O00.o00000O;
import p188o00o0O.OooOO0;
import p382o0OOoo0o.o00Ooo;
import p450o0Ooo00.OooO0OO;
import p526o0o0OOO0.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/module/media/MediaModuleServiceInitializer;", "Lcom/yalla/yalla/common/module_service/BaseModuleServiceInitializer;", "<init>", "()V", "Media_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class MediaModuleServiceInitializer extends BaseModuleServiceInitializer {
    @Override // com.yalla.yalla.common.module_service.BaseModuleServiceInitializer
    public final Object OooO00o() {
        return new OooO0OO();
    }

    @Override // com.yalla.yalla.common.module_service.BaseModuleServiceInitializer
    public final void OooO0O0() {
        OooOO0<Activity, o00000O> oooOO1 = oo0oOO0.f53618OooO00o;
        oo0oOO0.OooO0oo(MusicScreen.INSTANCE);
        oo0oOO0.OooO0oo(MusicAddScreen.INSTANCE);
        oo0oOO0.OooO0oo(MusicEditScreen.INSTANCE);
        oo0oOO0.OooO0oo(YLMediaPreViewScreen.INSTANCE);
        if (o00Ooo.OooO0o0()) {
            return;
        }
        oo0oOO0.OooO0oo(MediaTestScreen.INSTANCE);
    }
}
