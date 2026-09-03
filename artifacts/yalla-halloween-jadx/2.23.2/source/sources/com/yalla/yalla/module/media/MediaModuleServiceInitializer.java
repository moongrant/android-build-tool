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
import p105o000oo0o.o00O00OO;
import p190o00o0O.OooO;
import p386o0OOooO.oo0o0Oo;
import p456o0Ooo00o.o00Ooo;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/module/media/MediaModuleServiceInitializer;", "Lcom/yalla/yalla/common/module_service/BaseModuleServiceInitializer;", "<init>", "()V", "Media_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class MediaModuleServiceInitializer extends BaseModuleServiceInitializer {
    @Override // com.yalla.yalla.common.module_service.BaseModuleServiceInitializer
    public final Object OooO00o() {
        return new o00Ooo();
    }

    @Override // com.yalla.yalla.common.module_service.BaseModuleServiceInitializer
    public final void OooO0O0() {
        OooO<Activity, o00O00OO> oooO = o00O00.f53494OooO00o;
        o00O00.OooO0oo(MusicScreen.INSTANCE);
        o00O00.OooO0oo(MusicAddScreen.INSTANCE);
        o00O00.OooO0oo(MusicEditScreen.INSTANCE);
        o00O00.OooO0oo(YLMediaPreViewScreen.INSTANCE);
        if (oo0o0Oo.OooO0o0()) {
            return;
        }
        o00O00.OooO0oo(MediaTestScreen.INSTANCE);
    }
}
