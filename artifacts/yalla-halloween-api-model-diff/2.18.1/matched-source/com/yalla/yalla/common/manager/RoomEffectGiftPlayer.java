package com.yalla.yalla.common.manager;

import Oooo000.o000O00O;
import Oooo000.o00oO0o;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.GiftRoomModel;
import com.common.videoplayer.PlayState;
import com.common.videoplayer.player.PlayerType;
import com.common.videoplayer.view.AlphaVideoView;
import com.ss.ugc.android.alpha_player.controller.PlayerController;
import com.ss.ugc.android.alpha_player.model.AlphaVideoViewType;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;
import o0O00O0o.OooO0OO;
import o0O00O0o.OooO0o;
import org.cocos2dx.lib.Cocos2dxGLSurfaceView;
import org.cocos2dx.lib.out.event.EventHandle;
import org.cocos2dx.lib.out.event.YLGiftEventManager;
import org.cocos2dx.lib.out.gift.YLGiftController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p042Ooooo0o.o000O0Oo;
import p086o000OooO.o0O0O00;
import p143o00OOooo.o00O0O0O;
import p206o00o0o0o.o000OO0O;
import p254o00ooO0O.o0000O0;
import p405o0Oo0OO0.OooO;
import p405o0Oo0OO0.OooOO0;
import p405o0Oo0OO0.OooOo;
import p423o0OoO000.OooOOO;
import p423o0OoO000.OooOOO0;
import p468o0OooOoo.oO0000O;
import p515o0o0O00.o00O00;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001GB\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u00042\n\u0010\r\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0002J\u001b\u0010\u001d\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\nJ\u001d\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010\nJ&\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0014H\u0007J(\u0010%\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0018\u00010\u000bR\u00020\fH\u0007J\u0006\u0010&\u001a\u00020\u0004J\u0006\u0010'\u001a\u00020\u0004R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00107\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010C\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006H"}, d2 = {"Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer;", "", "", "muteSound", "", "setVolume", "launchPlayJob", "Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel;", "effectGiftModel", "playVideoGift", "(Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/app/base/model/GiftRoomModel$CustomGiftInfo;", "Lcom/app/base/model/GiftRoomModel;", "customGiftInfo", "", "loopCount", "playCustomMadeGift", "(Lcom/app/base/model/GiftRoomModel$CustomGiftInfo;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/yalla/yalla/common/ui/view/SVGAView;", "svgaView", "", "filePath", "Landroid/content/Context;", d.R, "Lo0Oo0OO0/OooOO0;", "dynamicEntity", "Lkotlin/Function0;", "onFinish", "startSvgaAnimation", "playCocosGift", "giftModel", "Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo;", "createGiftInfo", "giftId", "times", "giftVideoUrl", "addEffectGift", "addEffectGiftCustomMade", "reset", "release", "Lcom/app/base/mixedroom/MixedRoomActivity;", "activity", "Lcom/app/base/mixedroom/MixedRoomActivity;", "getActivity", "()Lcom/app/base/mixedroom/MixedRoomActivity;", "Lcom/common/videoplayer/view/AlphaVideoView;", "alphaVideoView", "Lcom/common/videoplayer/view/AlphaVideoView;", "Landroid/widget/FrameLayout;", "cocosAnimView", "Landroid/widget/FrameLayout;", "svgaViewContainer$delegate", "Lkotlin/Lazy;", "getSvgaViewContainer", "()Landroid/widget/FrameLayout;", "svgaViewContainer", "Lorg/cocos2dx/lib/out/gift/YLGiftController;", "cocosGiftController", "Lorg/cocos2dx/lib/out/gift/YLGiftController;", "", "effectGiftList", "Ljava/util/List;", "Lkotlinx/coroutines/Job;", "playJob", "Lkotlinx/coroutines/Job;", "", "scale", "F", "whRatio", "<init>", "(Lcom/app/base/mixedroom/MixedRoomActivity;)V", "EffectGiftModel", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomEffectGiftPlayer {
    public static final int $stable = 8;

    @NotNull
    private final MixedRoomActivity activity;

    @NotNull
    private final AlphaVideoView alphaVideoView;

    @NotNull
    private final FrameLayout cocosAnimView;

    @NotNull
    private final YLGiftController cocosGiftController;

    @NotNull
    private final List<EffectGiftModel> effectGiftList;

    @Nullable
    private Job playJob;
    private final float scale;

    /* JADX INFO: renamed from: svgaViewContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy svgaViewContainer;
    private final float whRatio;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0018\u00010\bR\u00020\tHÆ\u0003J7\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\tHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R \u0010\u0007\u001a\b\u0018\u00010\bR\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006*"}, d2 = {"Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel;", "", "giftId", "", "giftVideoUrl", "", "loopCount", "customGiftInfo", "Lcom/app/base/model/GiftRoomModel$CustomGiftInfo;", "Lcom/app/base/model/GiftRoomModel;", "(ILjava/lang/String;ILcom/app/base/model/GiftRoomModel$CustomGiftInfo;)V", "getCustomGiftInfo", "()Lcom/app/base/model/GiftRoomModel$CustomGiftInfo;", "setCustomGiftInfo", "(Lcom/app/base/model/GiftRoomModel$CustomGiftInfo;)V", "getGiftId", "()I", "setGiftId", "(I)V", "giftInfo", "Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo;", "getGiftInfo", "()Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo;", "setGiftInfo", "(Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo;)V", "getGiftVideoUrl", "()Ljava/lang/String;", "setGiftVideoUrl", "(Ljava/lang/String;)V", "getLoopCount", "setLoopCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "GiftInfo", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class EffectGiftModel {
        public static final int $stable = 8;

        @Nullable
        private GiftRoomModel.CustomGiftInfo customGiftInfo;
        private int giftId;
        public GiftInfo giftInfo;

        @NotNull
        private String giftVideoUrl;
        private int loopCount;

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo;", "", "()V", "CocosGiftInfo", "CustomGiftInfoTemp", "VideoGiftInfo", "Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo$CocosGiftInfo;", "Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo$CustomGiftInfoTemp;", "Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo$VideoGiftInfo;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static abstract class GiftInfo {
            public static final int $stable = 0;

            @StabilityInferred(parameters = 0)
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0015¨\u0006'"}, d2 = {"Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo$CocosGiftInfo;", "Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo;", "dir", "", "jsonName", "atlasName", "animName", "scale", "", "x", "y", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFF)V", "getAnimName", "()Ljava/lang/String;", "getAtlasName", "getDir", "getJsonName", "getScale", "()F", "getX", "setX", "(F)V", "getY", "setY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class CocosGiftInfo extends GiftInfo {
                public static final int $stable = 8;

                @NotNull
                private final String animName;

                @NotNull
                private final String atlasName;

                @NotNull
                private final String dir;

                @NotNull
                private final String jsonName;
                private final float scale;
                private float x;
                private float y;

                public /* synthetic */ CocosGiftInfo(String str, String str2, String str3, String str4, float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, str2, str3, str4, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f2, (i & 64) != 0 ? 0.1f : f3);
                }

                public static /* synthetic */ CocosGiftInfo copy$default(CocosGiftInfo cocosGiftInfo, String str, String str2, String str3, String str4, float f, float f2, float f3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = cocosGiftInfo.dir;
                    }
                    if ((i & 2) != 0) {
                        str2 = cocosGiftInfo.jsonName;
                    }
                    String str5 = str2;
                    if ((i & 4) != 0) {
                        str3 = cocosGiftInfo.atlasName;
                    }
                    String str6 = str3;
                    if ((i & 8) != 0) {
                        str4 = cocosGiftInfo.animName;
                    }
                    String str7 = str4;
                    if ((i & 16) != 0) {
                        f = cocosGiftInfo.scale;
                    }
                    float f4 = f;
                    if ((i & 32) != 0) {
                        f2 = cocosGiftInfo.x;
                    }
                    float f5 = f2;
                    if ((i & 64) != 0) {
                        f3 = cocosGiftInfo.y;
                    }
                    return cocosGiftInfo.copy(str, str5, str6, str7, f4, f5, f3);
                }

                @NotNull
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getDir() {
                    return this.dir;
                }

                @NotNull
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getJsonName() {
                    return this.jsonName;
                }

                @NotNull
                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getAtlasName() {
                    return this.atlasName;
                }

                @NotNull
                /* JADX INFO: renamed from: component4, reason: from getter */
                public final String getAnimName() {
                    return this.animName;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final float getScale() {
                    return this.scale;
                }

                /* JADX INFO: renamed from: component6, reason: from getter */
                public final float getX() {
                    return this.x;
                }

                /* JADX INFO: renamed from: component7, reason: from getter */
                public final float getY() {
                    return this.y;
                }

                @NotNull
                public final CocosGiftInfo copy(@NotNull String dir, @NotNull String jsonName, @NotNull String atlasName, @NotNull String animName, float scale, float x, float y) {
                    Intrinsics.checkNotNullParameter(dir, "dir");
                    Intrinsics.checkNotNullParameter(jsonName, "jsonName");
                    Intrinsics.checkNotNullParameter(atlasName, "atlasName");
                    Intrinsics.checkNotNullParameter(animName, "animName");
                    return new CocosGiftInfo(dir, jsonName, atlasName, animName, scale, x, y);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof CocosGiftInfo)) {
                        return false;
                    }
                    CocosGiftInfo cocosGiftInfo = (CocosGiftInfo) other;
                    return Intrinsics.areEqual(this.dir, cocosGiftInfo.dir) && Intrinsics.areEqual(this.jsonName, cocosGiftInfo.jsonName) && Intrinsics.areEqual(this.atlasName, cocosGiftInfo.atlasName) && Intrinsics.areEqual(this.animName, cocosGiftInfo.animName) && Intrinsics.areEqual((Object) Float.valueOf(this.scale), (Object) Float.valueOf(cocosGiftInfo.scale)) && Intrinsics.areEqual((Object) Float.valueOf(this.x), (Object) Float.valueOf(cocosGiftInfo.x)) && Intrinsics.areEqual((Object) Float.valueOf(this.y), (Object) Float.valueOf(cocosGiftInfo.y));
                }

                @NotNull
                public final String getAnimName() {
                    return this.animName;
                }

                @NotNull
                public final String getAtlasName() {
                    return this.atlasName;
                }

                @NotNull
                public final String getDir() {
                    return this.dir;
                }

                @NotNull
                public final String getJsonName() {
                    return this.jsonName;
                }

                public final float getScale() {
                    return this.scale;
                }

                public final float getX() {
                    return this.x;
                }

                public final float getY() {
                    return this.y;
                }

                public int hashCode() {
                    return Float.floatToIntBits(this.y) + o000O00O.OooO00o(this.x, o000O00O.OooO00o(this.scale, o0O0O00.OooO00o(this.animName, o0O0O00.OooO00o(this.atlasName, o0O0O00.OooO00o(this.jsonName, this.dir.hashCode() * 31, 31), 31), 31), 31), 31);
                }

                public final void setX(float f) {
                    this.x = f;
                }

                public final void setY(float f) {
                    this.y = f;
                }

                @NotNull
                public String toString() {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("CocosGiftInfo(dir=");
                    sbOooO0o0.append(this.dir);
                    sbOooO0o0.append(", jsonName=");
                    sbOooO0o0.append(this.jsonName);
                    sbOooO0o0.append(", atlasName=");
                    sbOooO0o0.append(this.atlasName);
                    sbOooO0o0.append(", animName=");
                    sbOooO0o0.append(this.animName);
                    sbOooO0o0.append(", scale=");
                    sbOooO0o0.append(this.scale);
                    sbOooO0o0.append(", x=");
                    sbOooO0o0.append(this.x);
                    sbOooO0o0.append(", y=");
                    return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.y, ')');
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CocosGiftInfo(@NotNull String dir, @NotNull String jsonName, @NotNull String atlasName, @NotNull String animName, float f, float f2, float f3) {
                    super(null);
                    Intrinsics.checkNotNullParameter(dir, "dir");
                    Intrinsics.checkNotNullParameter(jsonName, "jsonName");
                    Intrinsics.checkNotNullParameter(atlasName, "atlasName");
                    Intrinsics.checkNotNullParameter(animName, "animName");
                    this.dir = dir;
                    this.jsonName = jsonName;
                    this.atlasName = atlasName;
                    this.animName = animName;
                    this.scale = f;
                    this.x = f2;
                    this.y = f3;
                }
            }

            @StabilityInferred(parameters = 0)
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\t\u001a\u00060\u0003R\u00020\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003R\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001e\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo$CustomGiftInfoTemp;", "Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo;", "customGiftInfo", "Lcom/app/base/model/GiftRoomModel$CustomGiftInfo;", "Lcom/app/base/model/GiftRoomModel;", "(Lcom/app/base/model/GiftRoomModel$CustomGiftInfo;)V", "getCustomGiftInfo", "()Lcom/app/base/model/GiftRoomModel$CustomGiftInfo;", "setCustomGiftInfo", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class CustomGiftInfoTemp extends GiftInfo {
                public static final int $stable = 8;

                @NotNull
                private GiftRoomModel.CustomGiftInfo customGiftInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CustomGiftInfoTemp(@NotNull GiftRoomModel.CustomGiftInfo customGiftInfo) {
                    super(null);
                    Intrinsics.checkNotNullParameter(customGiftInfo, "customGiftInfo");
                    this.customGiftInfo = customGiftInfo;
                }

                public static /* synthetic */ CustomGiftInfoTemp copy$default(CustomGiftInfoTemp customGiftInfoTemp, GiftRoomModel.CustomGiftInfo customGiftInfo, int i, Object obj) {
                    if ((i & 1) != 0) {
                        customGiftInfo = customGiftInfoTemp.customGiftInfo;
                    }
                    return customGiftInfoTemp.copy(customGiftInfo);
                }

                @NotNull
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final GiftRoomModel.CustomGiftInfo getCustomGiftInfo() {
                    return this.customGiftInfo;
                }

                @NotNull
                public final CustomGiftInfoTemp copy(@NotNull GiftRoomModel.CustomGiftInfo customGiftInfo) {
                    Intrinsics.checkNotNullParameter(customGiftInfo, "customGiftInfo");
                    return new CustomGiftInfoTemp(customGiftInfo);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof CustomGiftInfoTemp) && Intrinsics.areEqual(this.customGiftInfo, ((CustomGiftInfoTemp) other).customGiftInfo);
                }

                @NotNull
                public final GiftRoomModel.CustomGiftInfo getCustomGiftInfo() {
                    return this.customGiftInfo;
                }

                public int hashCode() {
                    return this.customGiftInfo.hashCode();
                }

                public final void setCustomGiftInfo(@NotNull GiftRoomModel.CustomGiftInfo customGiftInfo) {
                    Intrinsics.checkNotNullParameter(customGiftInfo, "<set-?>");
                    this.customGiftInfo = customGiftInfo;
                }

                @NotNull
                public String toString() {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("CustomGiftInfoTemp(customGiftInfo=");
                    sbOooO0o0.append(this.customGiftInfo);
                    sbOooO0o0.append(')');
                    return sbOooO0o0.toString();
                }
            }

            @StabilityInferred(parameters = 0)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo$VideoGiftInfo;", "Lcom/yalla/yalla/common/manager/RoomEffectGiftPlayer$EffectGiftModel$GiftInfo;", "filePath", "", "(Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class VideoGiftInfo extends GiftInfo {
                public static final int $stable = 0;

                @NotNull
                private final String filePath;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public VideoGiftInfo(@NotNull String filePath) {
                    super(null);
                    Intrinsics.checkNotNullParameter(filePath, "filePath");
                    this.filePath = filePath;
                }

                public static /* synthetic */ VideoGiftInfo copy$default(VideoGiftInfo videoGiftInfo, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = videoGiftInfo.filePath;
                    }
                    return videoGiftInfo.copy(str);
                }

                @NotNull
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getFilePath() {
                    return this.filePath;
                }

                @NotNull
                public final VideoGiftInfo copy(@NotNull String filePath) {
                    Intrinsics.checkNotNullParameter(filePath, "filePath");
                    return new VideoGiftInfo(filePath);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof VideoGiftInfo) && Intrinsics.areEqual(this.filePath, ((VideoGiftInfo) other).filePath);
                }

                @NotNull
                public final String getFilePath() {
                    return this.filePath;
                }

                public int hashCode() {
                    return this.filePath.hashCode();
                }

                @NotNull
                public String toString() {
                    return o00oO0o.OooO0O0(OooO00o.OooO00o.OooO0o0("VideoGiftInfo(filePath="), this.filePath, ')');
                }
            }

            private GiftInfo() {
            }

            public /* synthetic */ GiftInfo(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public EffectGiftModel(int i, @NotNull String giftVideoUrl, int i2, @Nullable GiftRoomModel.CustomGiftInfo customGiftInfo) {
            Intrinsics.checkNotNullParameter(giftVideoUrl, "giftVideoUrl");
            this.giftId = i;
            this.giftVideoUrl = giftVideoUrl;
            this.loopCount = i2;
            this.customGiftInfo = customGiftInfo;
        }

        public static /* synthetic */ EffectGiftModel copy$default(EffectGiftModel effectGiftModel, int i, String str, int i2, GiftRoomModel.CustomGiftInfo customGiftInfo, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = effectGiftModel.giftId;
            }
            if ((i3 & 2) != 0) {
                str = effectGiftModel.giftVideoUrl;
            }
            if ((i3 & 4) != 0) {
                i2 = effectGiftModel.loopCount;
            }
            if ((i3 & 8) != 0) {
                customGiftInfo = effectGiftModel.customGiftInfo;
            }
            return effectGiftModel.copy(i, str, i2, customGiftInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getGiftId() {
            return this.giftId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getGiftVideoUrl() {
            return this.giftVideoUrl;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getLoopCount() {
            return this.loopCount;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final GiftRoomModel.CustomGiftInfo getCustomGiftInfo() {
            return this.customGiftInfo;
        }

        @NotNull
        public final EffectGiftModel copy(int giftId, @NotNull String giftVideoUrl, int loopCount, @Nullable GiftRoomModel.CustomGiftInfo customGiftInfo) {
            Intrinsics.checkNotNullParameter(giftVideoUrl, "giftVideoUrl");
            return new EffectGiftModel(giftId, giftVideoUrl, loopCount, customGiftInfo);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EffectGiftModel)) {
                return false;
            }
            EffectGiftModel effectGiftModel = (EffectGiftModel) other;
            return this.giftId == effectGiftModel.giftId && Intrinsics.areEqual(this.giftVideoUrl, effectGiftModel.giftVideoUrl) && this.loopCount == effectGiftModel.loopCount && Intrinsics.areEqual(this.customGiftInfo, effectGiftModel.customGiftInfo);
        }

        @Nullable
        public final GiftRoomModel.CustomGiftInfo getCustomGiftInfo() {
            return this.customGiftInfo;
        }

        public final int getGiftId() {
            return this.giftId;
        }

        @NotNull
        public final GiftInfo getGiftInfo() {
            GiftInfo giftInfo = this.giftInfo;
            if (giftInfo != null) {
                return giftInfo;
            }
            Intrinsics.throwUninitializedPropertyAccessException("giftInfo");
            return null;
        }

        @NotNull
        public final String getGiftVideoUrl() {
            return this.giftVideoUrl;
        }

        public final int getLoopCount() {
            return this.loopCount;
        }

        public int hashCode() {
            int iOooO00o = (o0O0O00.OooO00o(this.giftVideoUrl, this.giftId * 31, 31) + this.loopCount) * 31;
            GiftRoomModel.CustomGiftInfo customGiftInfo = this.customGiftInfo;
            return iOooO00o + (customGiftInfo == null ? 0 : customGiftInfo.hashCode());
        }

        public final void setCustomGiftInfo(@Nullable GiftRoomModel.CustomGiftInfo customGiftInfo) {
            this.customGiftInfo = customGiftInfo;
        }

        public final void setGiftId(int i) {
            this.giftId = i;
        }

        public final void setGiftInfo(@NotNull GiftInfo giftInfo) {
            Intrinsics.checkNotNullParameter(giftInfo, "<set-?>");
            this.giftInfo = giftInfo;
        }

        public final void setGiftVideoUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.giftVideoUrl = str;
        }

        public final void setLoopCount(int i) {
            this.loopCount = i;
        }

        @NotNull
        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("EffectGiftModel(giftId=");
            sbOooO0o0.append(this.giftId);
            sbOooO0o0.append(", giftVideoUrl=");
            sbOooO0o0.append(this.giftVideoUrl);
            sbOooO0o0.append(", loopCount=");
            sbOooO0o0.append(this.loopCount);
            sbOooO0o0.append(", customGiftInfo=");
            sbOooO0o0.append(this.customGiftInfo);
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }

        public /* synthetic */ EffectGiftModel(int i, String str, int i2, GiftRoomModel.CustomGiftInfo customGiftInfo, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : customGiftInfo);
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$createGiftInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.RoomEffectGiftPlayer", f = "RoomEffectGiftPlayer.kt", i = {1}, l = {291, 297}, m = "createGiftInfo", n = {"giftModel"}, s = {"L$0"})
    public static final class C04651 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C04651(Continuation<? super C04651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomEffectGiftPlayer.this.createGiftInfo(null, this);
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$createGiftInfo$2, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.RoomEffectGiftPlayer$createGiftInfo$2", f = "RoomEffectGiftPlayer.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ EffectGiftModel $giftModel;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public final /* synthetic */ RoomEffectGiftPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EffectGiftModel effectGiftModel, RoomEffectGiftPlayer roomEffectGiftPlayer, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$giftModel = effectGiftModel;
            this.this$0 = roomEffectGiftPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$giftModel, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x004a  */
        /* JADX WARN: Code duplicated, block: B:13:0x006b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x006c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006c -> B:15:0x0073). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.L$2
                com.app.base.model.GiftRoomModel$CustomGiftInfo$CustomShowAvatarInfoDTO r1 = (com.app.base.model.GiftRoomModel.CustomGiftInfo.CustomShowAvatarInfoDTO) r1
                java.lang.Object r3 = r10.L$1
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r10.L$0
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer r4 = (com.yalla.yalla.common.manager.RoomEffectGiftPlayer) r4
                kotlin.ResultKt.throwOnFailure(r11)
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L73
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                kotlin.ResultKt.throwOnFailure(r11)
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer$EffectGiftModel r11 = r10.$giftModel
                com.app.base.model.GiftRoomModel$CustomGiftInfo r11 = r11.getCustomGiftInfo()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
                java.util.List<com.app.base.model.GiftRoomModel$CustomGiftInfo$CustomShowAvatarInfoDTO> r11 = r11.customShowAvatarInfo
                java.lang.String r1 = "giftModel.customGiftInfo!!.customShowAvatarInfo"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer r1 = r10.this$0
                java.util.Iterator r11 = r11.iterator()
                r3 = r11
                r4 = r1
                r11 = r10
            L44:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L7c
                java.lang.Object r1 = r3.next()
                com.app.base.model.GiftRoomModel$CustomGiftInfo$CustomShowAvatarInfoDTO r1 = (com.app.base.model.GiftRoomModel.CustomGiftInfo.CustomShowAvatarInfoDTO) r1
                com.yalla.yalla.common.manager.GiftVideoManager r5 = com.yalla.yalla.common.manager.GiftVideoManager.INSTANCE
                com.app.base.mixedroom.MixedRoomActivity r6 = r4.getActivity()
                java.lang.String r7 = r1.headPhoto
                java.lang.String r8 = "it.headPhoto"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
                r11.L$0 = r4
                r11.L$1 = r3
                r11.L$2 = r1
                r11.label = r2
                java.lang.Object r5 = r5.downloadPicThenTransform2Bitmap(r6, r7, r11)
                if (r5 != r0) goto L6c
                return r0
            L6c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L73:
                android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
                r3.headPhotoBitmap = r11
                r11 = r0
                r0 = r1
                r3 = r4
                r4 = r5
                goto L44
            L7c:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yalla.yalla.common.manager.RoomEffectGiftPlayer.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$launchPlayJob$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.RoomEffectGiftPlayer$launchPlayJob$1", f = "RoomEffectGiftPlayer.kt", i = {0}, l = {115, 120, 123, 126}, m = "invokeSuspend", n = {"effectGiftModel"}, s = {"L$0"})
    public static final class C04661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object L$0;
        public int label;

        /* JADX INFO: renamed from: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$launchPlayJob$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.yalla.yalla.common.manager.RoomEffectGiftPlayer$launchPlayJob$1$1", f = "RoomEffectGiftPlayer.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ EffectGiftModel $effectGiftModel;
            public int label;
            public final /* synthetic */ RoomEffectGiftPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02011(RoomEffectGiftPlayer roomEffectGiftPlayer, EffectGiftModel effectGiftModel, Continuation<? super C02011> continuation) {
                super(2, continuation);
                this.this$0 = roomEffectGiftPlayer;
                this.$effectGiftModel = effectGiftModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C02011(this.this$0, this.$effectGiftModel, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C02011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RoomEffectGiftPlayer roomEffectGiftPlayer = this.this$0;
                    GiftRoomModel.CustomGiftInfo customGiftInfo = this.$effectGiftModel.getCustomGiftInfo();
                    Intrinsics.checkNotNull(customGiftInfo);
                    int loopCount = this.$effectGiftModel.getLoopCount();
                    this.label = 1;
                    if (roomEffectGiftPlayer.playCustomMadeGift(customGiftInfo, loopCount, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public C04661(Continuation<? super C04661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RoomEffectGiftPlayer.this.new C04661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x003a  */
        /* JADX WARN: Code duplicated, block: B:17:0x005c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x005d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0067  */
        /* JADX WARN: Code duplicated, block: B:24:0x006e  */
        /* JADX WARN: Code duplicated, block: B:26:0x007a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x007b  */
        /* JADX WARN: Code duplicated, block: B:29:0x007f  */
        /* JADX WARN: Code duplicated, block: B:31:0x008b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x008c  */
        /* JADX WARN: Code duplicated, block: B:34:0x0092  */
        /* JADX WARN: Code duplicated, block: B:36:0x00a3 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a4 -> B:13:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L29
                if (r1 == r5) goto L1e
                if (r1 == r4) goto L29
                if (r1 == r3) goto L29
                if (r1 != r2) goto L16
                goto L29
            L16:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1e:
                java.lang.Object r1 = r10.L$0
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer$EffectGiftModel r1 = (com.yalla.yalla.common.manager.RoomEffectGiftPlayer.EffectGiftModel) r1
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r1
                r1 = r0
                r0 = r10
                goto L62
            L29:
                kotlin.ResultKt.throwOnFailure(r11)
                r11 = r10
            L2d:
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer r1 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.this
                java.util.List r1 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.access$getEffectGiftList$p(r1)
                boolean r1 = r1.isEmpty()
                r1 = r1 ^ r5
                if (r1 == 0) goto La7
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer r1 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.this
                java.util.List r1 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.access$getEffectGiftList$p(r1)
                r7 = 0
                java.lang.Object r1 = r1.get(r7)
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer$EffectGiftModel r1 = (com.yalla.yalla.common.manager.RoomEffectGiftPlayer.EffectGiftModel) r1
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer r8 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.this
                java.util.List r8 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.access$getEffectGiftList$p(r8)
                r8.remove(r7)
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer r7 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.this
                r11.L$0 = r1
                r11.label = r5
                java.lang.Object r7 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.access$createGiftInfo(r7, r1, r11)
                if (r7 != r0) goto L5d
                return r0
            L5d:
                r9 = r0
                r0 = r11
                r11 = r7
                r7 = r1
                r1 = r9
            L62:
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer$EffectGiftModel$GiftInfo r11 = (com.yalla.yalla.common.manager.RoomEffectGiftPlayer.EffectGiftModel.GiftInfo) r11
                if (r11 != 0) goto L67
                goto La4
            L67:
                r7.setGiftInfo(r11)
                boolean r8 = r11 instanceof com.yalla.yalla.common.manager.RoomEffectGiftPlayer.EffectGiftModel.GiftInfo.VideoGiftInfo
                if (r8 == 0) goto L7b
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer r11 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.this
                r0.L$0 = r6
                r0.label = r4
                java.lang.Object r11 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.access$playVideoGift(r11, r7, r0)
                if (r11 != r1) goto La4
                return r1
            L7b:
                boolean r11 = r11 instanceof com.yalla.yalla.common.manager.RoomEffectGiftPlayer.EffectGiftModel.GiftInfo.CocosGiftInfo
                if (r11 == 0) goto L8c
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer r11 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.this
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r11 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.access$playCocosGift(r11, r7, r0)
                if (r11 != r1) goto La4
                return r1
            L8c:
                com.app.base.model.GiftRoomModel$CustomGiftInfo r11 = r7.getCustomGiftInfo()
                if (r11 == 0) goto La4
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer$launchPlayJob$1$1 r11 = new com.yalla.yalla.common.manager.RoomEffectGiftPlayer$launchPlayJob$1$1
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer r8 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.this
                r11.<init>(r8, r7, r6)
                r0.L$0 = r6
                r0.label = r2
                java.lang.Object r11 = p254o00ooO0O.o0000O0.OooO0Oo(r11, r0)
                if (r11 != r1) goto La4
                return r1
            La4:
                r11 = r0
                r0 = r1
                goto L2d
            La7:
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer r11 = com.yalla.yalla.common.manager.RoomEffectGiftPlayer.this
                com.yalla.yalla.common.manager.RoomEffectGiftPlayer.access$setPlayJob$p(r11, r6)
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yalla.yalla.common.manager.RoomEffectGiftPlayer.C04661.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$playCocosGift$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.RoomEffectGiftPlayer", f = "RoomEffectGiftPlayer.kt", i = {}, l = {244}, m = "playCocosGift", n = {}, s = {})
    public static final class C04671 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C04671(Continuation<? super C04671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomEffectGiftPlayer.this.playCocosGift(null, this);
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$playCocosGift$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.RoomEffectGiftPlayer$playCocosGift$2", f = "RoomEffectGiftPlayer.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04682 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public final /* synthetic */ EffectGiftModel.GiftInfo.CocosGiftInfo $giftInfo;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04682(EffectGiftModel.GiftInfo.CocosGiftInfo cocosGiftInfo, Continuation<? super C04682> continuation) {
            super(2, continuation);
            this.$giftInfo = cocosGiftInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m256invokeSuspend$lambda0(EffectGiftModel.GiftInfo.CocosGiftInfo cocosGiftInfo) {
            YLGiftController.play(cocosGiftInfo.getDir(), cocosGiftInfo.getJsonName(), cocosGiftInfo.getAtlasName(), cocosGiftInfo.getAnimName(), cocosGiftInfo.getScale(), cocosGiftInfo.getX(), cocosGiftInfo.getY());
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RoomEffectGiftPlayer.this.new C04682(this.$giftInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((C04682) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Cocos2dxGLSurfaceView cocos2dxGLSurfaceView = RoomEffectGiftPlayer.this.getActivity().f11471OoooOo0;
                final EffectGiftModel.GiftInfo.CocosGiftInfo cocosGiftInfo = this.$giftInfo;
                cocos2dxGLSurfaceView.queueEvent(new Runnable() { // from class: com.yalla.yalla.common.manager.OooO0O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RoomEffectGiftPlayer.C04682.m256invokeSuspend$lambda0(cocosGiftInfo);
                    }
                });
                this.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                YLGiftEventManager.getInstance().registerEventHandle(YLGiftEventManager.KEY_GIFT_EVENT, new EventHandle() { // from class: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$playCocosGift$2$2$handler$1
                    @Override // org.cocos2dx.lib.out.event.EventHandle
                    public final void handleEvent(Object[] objArr) {
                        YLGiftEventManager.getInstance().unRegisterEventHandle(YLGiftEventManager.KEY_GIFT_EVENT);
                        CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m502constructorimpl(Boolean.TRUE));
                    }
                });
                obj = cancellableContinuationImpl.getResult();
                if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$playCustomMadeGift$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.RoomEffectGiftPlayer", f = "RoomEffectGiftPlayer.kt", i = {0, 0, 0, 0, 0}, l = {184}, m = "playCustomMadeGift", n = {"this", "customGiftInfo", "dynamicEntity", "svgaView", "loopCount"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
    public static final class C04691 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C04691(Continuation<? super C04691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomEffectGiftPlayer.this.playCustomMadeGift(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$playVideoGift$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.RoomEffectGiftPlayer", f = "RoomEffectGiftPlayer.kt", i = {0}, l = {ZegoConstants.RoomError.SessionError}, m = "playVideoGift", n = {"this"}, s = {"L$0"})
    public static final class C04701 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C04701(Continuation<? super C04701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomEffectGiftPlayer.this.playVideoGift(null, this);
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$playVideoGift$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.RoomEffectGiftPlayer$playVideoGift$2", f = "RoomEffectGiftPlayer.kt", i = {}, l = {143, 451}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04712 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public final /* synthetic */ EffectGiftModel $effectGiftModel;
        public final /* synthetic */ OooO0o $videoItem;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ RoomEffectGiftPlayer this$0;

        /* JADX INFO: renamed from: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$playVideoGift$2$1, reason: invalid class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.yalla.yalla.common.manager.RoomEffectGiftPlayer$playVideoGift$2$1", f = "RoomEffectGiftPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ OooO0o $videoItem;
            public int label;
            public final /* synthetic */ RoomEffectGiftPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RoomEffectGiftPlayer roomEffectGiftPlayer, OooO0o oooO0o, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = roomEffectGiftPlayer;
                this.$videoItem = oooO0o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$videoItem, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, o0OoO0OO.o0Oo0oo] */
            /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, o0OoO0OO.o0Oo0oo] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                PlayerController playerController;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AlphaVideoView alphaVideoView = this.this$0.alphaVideoView;
                OooO0o videoItem = this.$videoItem;
                Objects.requireNonNull(alphaVideoView);
                Intrinsics.checkNotNullParameter(videoItem, "videoItem");
                String strSubstringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(videoItem.f35128OooO00o, "/", (String) null, 2, (Object) null);
                String strSubstringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default(videoItem.f35128OooO00o, "/", (String) null, 2, (Object) null);
                oO0000O oo0000o = new oO0000O();
                String str = File.separator;
                Intrinsics.checkExpressionValueIsNotNull(str, "File.separator");
                if (!StringsKt__StringsJVMKt.endsWith$default(strSubstringBeforeLast$default, str, false, 2, null)) {
                    strSubstringBeforeLast$default = OooOo00.OooO0Oo(strSubstringBeforeLast$default, str);
                }
                oo0000o.f40573OooO00o = strSubstringBeforeLast$default;
                int iOrdinal = videoItem.f35130OooO0OO.ordinal();
                oo0000o.f40574OooO0O0 = strSubstringAfterLast$default;
                ScaleType.Companion companion = ScaleType.INSTANCE;
                oo0000o.f40576OooO0Oo = companion.OooO00o(iOrdinal);
                int iOrdinal2 = videoItem.f35130OooO0OO.ordinal();
                oo0000o.f40575OooO0OO = strSubstringAfterLast$default;
                oo0000o.f40577OooO0o0 = companion.OooO00o(iOrdinal2);
                if (oo0000o.OooO00o() && (playerController = alphaVideoView.f12661Oooo0oO) != null) {
                    if (oo0000o.OooO00o()) {
                        ?? r1 = playerController.f19837OoooO0O;
                        if (r1 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
                        }
                        r1.setVisibility(0);
                        ?? r2 = playerController.f19837OoooO0O;
                        if (r2 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
                        }
                        r2.bringToFront();
                        playerController.OooO0oo(playerController.OooO0Oo(2, oo0000o));
                    } else {
                        playerController.OooO00o();
                        PlayerController.OooO0o0(playerController, false, "dataSource is invalid!");
                    }
                    alphaVideoView.setVisibility(0);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04712(EffectGiftModel effectGiftModel, RoomEffectGiftPlayer roomEffectGiftPlayer, OooO0o oooO0o, Continuation<? super C04712> continuation) {
            super(2, continuation);
            this.$effectGiftModel = effectGiftModel;
            this.this$0 = roomEffectGiftPlayer;
            this.$videoItem = oooO0o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04712(this.$effectGiftModel, this.this$0, this.$videoItem, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((C04712) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            }
            ResultKt.throwOnFailure(obj);
            o00O00.OooO0OO("RoomEffectGiftPlayer", "playVideoGift effectGiftModel = " + this.$effectGiftModel);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$videoItem, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            final RoomEffectGiftPlayer roomEffectGiftPlayer = this.this$0;
            final EffectGiftModel effectGiftModel = this.$effectGiftModel;
            this.L$0 = roomEffectGiftPlayer;
            this.L$1 = effectGiftModel;
            this.label = 2;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            roomEffectGiftPlayer.alphaVideoView.setStateChangedListener(new OooO0OO() { // from class: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$playVideoGift$2$2$1
                @Override // o0O00O0o.OooO0OO
                public void onStateChanged(@NotNull PlayState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    if (state == PlayState.Stop) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("playVideoGift Stop effectGiftModel = ");
                        sbOooO0o0.append(effectGiftModel);
                        o00O00.OooO0OO("RoomEffectGiftPlayer", sbOooO0o0.toString());
                        roomEffectGiftPlayer.alphaVideoView.setStateChangedListener(null);
                        CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m502constructorimpl(Boolean.TRUE));
                    }
                }
            });
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        }
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.View, o0OoO0OO.o0Oo0oo] */
    public RoomEffectGiftPlayer(@NotNull MixedRoomActivity lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "activity");
        this.activity = lifecycleOwner;
        View viewFindViewById = lifecycleOwner.findViewById(R.id.alphaVideoView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById(R.id.alphaVideoView)");
        AlphaVideoView alphaVideoView = (AlphaVideoView) viewFindViewById;
        this.alphaVideoView = alphaVideoView;
        View viewFindViewById2 = lifecycleOwner.findViewById(R.id.cocosAnimView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "activity.findViewById(R.id.cocosAnimView)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        this.cocosAnimView = frameLayout;
        this.svgaViewContainer = LazyKt.lazy(new Function0<FrameLayout>() { // from class: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$svgaViewContainer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final FrameLayout invoke() {
                return (FrameLayout) this.this$0.getActivity().findViewById(R.id.svgaViewContainer);
            }
        });
        this.cocosGiftController = new YLGiftController();
        this.effectGiftList = new ArrayList();
        this.scale = o000OO0O.OooO0oo() / 750.0f;
        this.whRatio = (o000OO0O.OooO0oo() * 1.0f) / o000OO0O.OooO0oO();
        PlayerType playerType = PlayerType.ExoPlayer;
        Objects.requireNonNull(alphaVideoView);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(playerType, "playerType");
        Context context = alphaVideoView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        AlphaVideoViewType alphaVideoViewType = AlphaVideoViewType.GL_TEXTURE_VIEW;
        OooOOO oooOOO = alphaVideoView.f12662Oooo0oo;
        PlayerController playerController = new PlayerController(context, lifecycleOwner, alphaVideoViewType, oooOOO == null ? new OooOOO0() : oooOOO);
        alphaVideoView.f12661Oooo0oO = playerController;
        playerController.f19836OoooO00 = new o0O00OO.OooO00o(alphaVideoView);
        playerController.f19830Oooo = new o0O00OO.OooO0O0();
        ?? r2 = playerController.f19837OoooO0O;
        if (r2 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
        }
        r2.OooO0o(alphaVideoView);
        frameLayout.addView(lifecycleOwner.f11471OoooOo0, -1, -1);
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.common.manager.RoomEffectGiftPlayer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner2) {
                androidx.lifecycle.OooO0O0.OooO00o(this, lifecycleOwner2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                RoomEffectGiftPlayer.this.release();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner2) {
                androidx.lifecycle.OooO0O0.OooO0OO(this, lifecycleOwner2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner2) {
                androidx.lifecycle.OooO0O0.OooO0Oo(this, lifecycleOwner2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner2) {
                androidx.lifecycle.OooO0O0.OooO0o0(this, lifecycleOwner2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner2) {
                androidx.lifecycle.OooO0O0.OooO0o(this, lifecycleOwner2);
            }
        });
        o00OO00O.f43313OooooOo.OooO00o().f43333OooOOoo.observe(lifecycleOwner, new o00O0O0O(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m255_init_$lambda0(RoomEffectGiftPlayer this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setVolume(z);
    }

    public static /* synthetic */ void addEffectGift$default(RoomEffectGiftPlayer roomEffectGiftPlayer, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            str = "";
        }
        roomEffectGiftPlayer.addEffectGift(i, i2, str);
    }

    public static /* synthetic */ void addEffectGiftCustomMade$default(RoomEffectGiftPlayer roomEffectGiftPlayer, int i, int i2, GiftRoomModel.CustomGiftInfo customGiftInfo, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        roomEffectGiftPlayer.addEffectGiftCustomMade(i, i2, customGiftInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object createGiftInfo(EffectGiftModel effectGiftModel, Continuation<? super EffectGiftModel.GiftInfo> continuation) throws Throwable {
        C04651 c04651;
        EffectGiftModel effectGiftModel2 = effectGiftModel;
        if (continuation instanceof C04651) {
            c04651 = (C04651) continuation;
            int i = c04651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04651.label = i - Integer.MIN_VALUE;
            } else {
                c04651 = new C04651(continuation);
            }
        } else {
            c04651 = new C04651(continuation);
        }
        Object objWithContext = c04651.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04651.label;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                effectGiftModel2 = (EffectGiftModel) c04651.L$0;
                ResultKt.throwOnFailure(objWithContext);
                GiftRoomModel.CustomGiftInfo customGiftInfo = effectGiftModel2.getCustomGiftInfo();
                Intrinsics.checkNotNull(customGiftInfo);
                return new EffectGiftModel.GiftInfo.CustomGiftInfoTemp(customGiftInfo);
            }
            ResultKt.throwOnFailure(objWithContext);
            String str = (String) objWithContext;
            o00O00.OooO0OO("RoomEffectGiftPlayer", "createGiftInfo videoFilePath = " + str);
            return new EffectGiftModel.GiftInfo.VideoGiftInfo(str);
        }
        ResultKt.throwOnFailure(objWithContext);
        if (!StringsKt.isBlank(effectGiftModel.getGiftVideoUrl())) {
            CoroutineDispatcher io2 = Dispatchers.getIO();
            RoomEffectGiftPlayer$createGiftInfo$videoFilePath$1 roomEffectGiftPlayer$createGiftInfo$videoFilePath$1 = new RoomEffectGiftPlayer$createGiftInfo$videoFilePath$1(effectGiftModel2, null);
            c04651.label = 1;
            objWithContext = BuildersKt.withContext(io2, roomEffectGiftPlayer$createGiftInfo$videoFilePath$1, c04651);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            String str2 = (String) objWithContext;
            o00O00.OooO0OO("RoomEffectGiftPlayer", "createGiftInfo videoFilePath = " + str2);
            return new EffectGiftModel.GiftInfo.VideoGiftInfo(str2);
        }
        if (effectGiftModel.getCustomGiftInfo() != null) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(effectGiftModel2, this, null);
            c04651.L$0 = effectGiftModel2;
            c04651.label = 2;
            if (o0000O0.OooO0OO(anonymousClass2, c04651) == coroutine_suspended) {
                return coroutine_suspended;
            }
            GiftRoomModel.CustomGiftInfo customGiftInfo2 = effectGiftModel2.getCustomGiftInfo();
            Intrinsics.checkNotNull(customGiftInfo2);
            return new EffectGiftModel.GiftInfo.CustomGiftInfoTemp(customGiftInfo2);
        }
        int giftId = effectGiftModel.getGiftId();
        if (giftId == 13) {
            return new EffectGiftModel.GiftInfo.CocosGiftInfo("cruise/", "chuan.json", "chuan.atlas", "chuan", this.scale * 1.389f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.4f);
        }
        if (giftId == 26) {
            return new EffectGiftModel.GiftInfo.CocosGiftInfo("ferrari/", "Ferrari.json", "Ferrari.atlas", "Ferrari", this.scale * 1.389f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 96, null);
        }
        if (giftId == 50) {
            return new EffectGiftModel.GiftInfo.CocosGiftInfo("bomb/", "baoza.json", "baoza.atlas", "baoza", (this.whRatio < 0.75f ? this.scale * 0.75f : this.scale) * 1.389f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 96, null);
        }
        if (giftId == 52) {
            return new EffectGiftModel.GiftInfo.CocosGiftInfo("helicopter/", "Helicopter.json", "Helicopter.atlas", "Helicopter", this.scale * 1.289f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 96, null);
        }
        if (giftId == 96) {
            return new EffectGiftModel.GiftInfo.CocosGiftInfo("yezao/", "yezaoshu.json", "yezaoshu.atlas", "animation", this.scale * 1.3f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.1f);
        }
        if (giftId == 999) {
            return new EffectGiftModel.GiftInfo.CocosGiftInfo("money/", "xiaoma.json", "xiaoma.atlas", "xiaoma", this.scale * 2.4f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 96, null);
        }
        if (giftId == 83) {
            return new EffectGiftModel.GiftInfo.CocosGiftInfo("fireworks/", "yanhua.json", "yanhua.atlas", "yanhua", this.scale * 1.389f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.1f);
        }
        if (giftId == 84) {
            return new EffectGiftModel.GiftInfo.CocosGiftInfo("lamborghini/", "Lamborghini.json", "Lamborghini.atlas", "Lamborghini", this.scale * 1.389f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.1f);
        }
        switch (giftId) {
            case 109:
                return new EffectGiftModel.GiftInfo.CocosGiftInfo("castle/", "castle.json", "castle.atlas", "castle", this.scale * 2.44f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 96, null);
            case 110:
                return new EffectGiftModel.GiftInfo.CocosGiftInfo("fly/", "skeleton.json", "skeleton.atlas", "animation", this.scale * 2.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 96, null);
            case 111:
                return new EffectGiftModel.GiftInfo.CocosGiftInfo("star/", "nan.json", "nan.atlas", "animation", this.scale * 2.4f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 96, null);
            case 112:
                return new EffectGiftModel.GiftInfo.CocosGiftInfo("haidao/", "island.json", "island.atlas", "animation", this.scale * 2.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 96, null);
            default:
                return null;
        }
    }

    private final FrameLayout getSvgaViewContainer() {
        Object value = this.svgaViewContainer.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-svgaViewContainer>(...)");
        return (FrameLayout) value;
    }

    private final void launchPlayJob() {
        if (this.effectGiftList.isEmpty() || this.playJob != null) {
            return;
        }
        this.playJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.activity), Dispatchers.getDefault(), null, new C04661(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object playCocosGift(EffectGiftModel effectGiftModel, Continuation<? super Unit> continuation) {
        C04671 c04671;
        if (continuation instanceof C04671) {
            c04671 = (C04671) continuation;
            int i = c04671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04671.label = i - Integer.MIN_VALUE;
            } else {
                c04671 = new C04671(continuation);
            }
        } else {
            c04671 = new C04671(continuation);
        }
        Object obj = c04671.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04671.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                EffectGiftModel.GiftInfo giftInfo = effectGiftModel.getGiftInfo();
                Intrinsics.checkNotNull(giftInfo, "null cannot be cast to non-null type com.yalla.yalla.common.manager.RoomEffectGiftPlayer.EffectGiftModel.GiftInfo.CocosGiftInfo");
                EffectGiftModel.GiftInfo.CocosGiftInfo cocosGiftInfo = (EffectGiftModel.GiftInfo.CocosGiftInfo) giftInfo;
                long loopCount = ((long) 25000) * ((long) (effectGiftModel.getLoopCount() + 1));
                C04682 c04682 = new C04682(cocosGiftInfo, null);
                c04671.label = 1;
                if (TimeoutKt.withTimeout(loopCount, c04682, c04671) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception unused) {
            YLGiftEventManager.getInstance().unRegisterEventHandle(YLGiftEventManager.KEY_GIFT_EVENT);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object playCustomMadeGift(GiftRoomModel.CustomGiftInfo customGiftInfo, int i, Continuation<? super Unit> continuation) {
        C04691 c04691;
        RoomEffectGiftPlayer roomEffectGiftPlayer;
        if (continuation instanceof C04691) {
            c04691 = (C04691) continuation;
            int i2 = c04691.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c04691.label = i2 - Integer.MIN_VALUE;
            } else {
                c04691 = new C04691(continuation);
            }
        } else {
            c04691 = new C04691(continuation);
        }
        C04691 c04692 = c04691;
        Object obj = c04692.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c04692.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (TextUtils.isEmpty(customGiftInfo.customSkinUrl)) {
                return Unit.INSTANCE;
            }
            try {
                getSvgaViewContainer().removeAllViews();
                OooOO0 oooOO1 = new OooOO0();
                List<String> list = customGiftInfo.customHideInfo;
                Intrinsics.checkNotNullExpressionValue(list, "customGiftInfo.customHideInfo");
                for (String it : list) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    oooOO1.OooO0OO(true, it);
                }
                List<GiftRoomModel.CustomGiftInfo.CustomShowAvatarInfoDTO> list2 = customGiftInfo.customShowAvatarInfo;
                Intrinsics.checkNotNullExpressionValue(list2, "customGiftInfo.customShowAvatarInfo");
                for (GiftRoomModel.CustomGiftInfo.CustomShowAvatarInfoDTO customShowAvatarInfoDTO : list2) {
                    Bitmap bitmap = customShowAvatarInfoDTO.headPhotoBitmap;
                    Intrinsics.checkNotNullExpressionValue(bitmap, "it.headPhotoBitmap");
                    String str = customShowAvatarInfoDTO.position;
                    Intrinsics.checkNotNullExpressionValue(str, "it.position");
                    oooOO1.OooO00o(bitmap, str);
                }
                SVGAView sVGAView = new SVGAView(this.activity, null, 0, 6, null);
                getSvgaViewContainer().addView(sVGAView, new ViewGroup.LayoutParams(-1, -1));
                c04692.L$0 = this;
                c04692.L$1 = customGiftInfo;
                c04692.L$2 = oooOO1;
                c04692.L$3 = sVGAView;
                c04692.I$0 = i;
                c04692.label = 1;
                final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(c04692));
                String str2 = customGiftInfo.customSkinUrl;
                Intrinsics.checkNotNullExpressionValue(str2, "customGiftInfo.customSkinUrl");
                startSvgaAnimation(sVGAView, str2, this.activity, oooOO1, i, new Function0<Unit>() { // from class: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$playCustomMadeGift$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Continuation<Object> continuation2 = safeContinuation;
                        Result.Companion companion = Result.INSTANCE;
                        continuation2.resumeWith(Result.m502constructorimpl(""));
                    }
                });
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(c04692);
                }
                if (orThrow == coroutine_suspended) {
                    return coroutine_suspended;
                }
                roomEffectGiftPlayer = this;
            } catch (Exception unused) {
                roomEffectGiftPlayer = this;
                roomEffectGiftPlayer.alphaVideoView.setStateChangedListener(null);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            roomEffectGiftPlayer = (RoomEffectGiftPlayer) c04692.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused2) {
                roomEffectGiftPlayer.alphaVideoView.setStateChangedListener(null);
            }
        }
        roomEffectGiftPlayer.getSvgaViewContainer().removeAllViews();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object playVideoGift(EffectGiftModel effectGiftModel, Continuation<? super Unit> continuation) {
        C04701 c04701;
        RoomEffectGiftPlayer roomEffectGiftPlayer;
        if (continuation instanceof C04701) {
            c04701 = (C04701) continuation;
            int i = c04701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04701.label = i - Integer.MIN_VALUE;
            } else {
                c04701 = new C04701(continuation);
            }
        } else {
            c04701 = new C04701(continuation);
        }
        Object obj = c04701.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04701.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            EffectGiftModel.GiftInfo giftInfo = effectGiftModel.getGiftInfo();
            Intrinsics.checkNotNull(giftInfo, "null cannot be cast to non-null type com.yalla.yalla.common.manager.RoomEffectGiftPlayer.EffectGiftModel.GiftInfo.VideoGiftInfo");
            OooO0o oooO0o = new OooO0o(((EffectGiftModel.GiftInfo.VideoGiftInfo) giftInfo).getFilePath(), effectGiftModel.getLoopCount());
            try {
                long loopCount = ((long) 25000) * ((long) (effectGiftModel.getLoopCount() + 1));
                C04712 c04712 = new C04712(effectGiftModel, this, oooO0o, null);
                c04701.L$0 = this;
                c04701.label = 1;
                if (TimeoutKt.withTimeout(loopCount, c04712, c04701) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception unused) {
                roomEffectGiftPlayer = this;
                roomEffectGiftPlayer.alphaVideoView.setStateChangedListener(null);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            roomEffectGiftPlayer = (RoomEffectGiftPlayer) c04701.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused2) {
                roomEffectGiftPlayer.alphaVideoView.setStateChangedListener(null);
            }
        }
        return Unit.INSTANCE;
    }

    private final void setVolume(boolean muteSound) {
        this.alphaVideoView.setVolume(muteSound ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : 1.0f);
    }

    private final void startSvgaAnimation(final SVGAView svgaView, String filePath, Context context, final OooOO0 dynamicEntity, final int loopCount, final Function0<Unit> onFinish) {
        try {
            new p405o0Oo0OO0.OooOo00(context).OooO(new URL(filePath), new o0Oo0OO0.OooOo00.OooO0O0() { // from class: com.yalla.yalla.common.manager.RoomEffectGiftPlayer.startSvgaAnimation.1
                @Override // o0Oo0OO0.OooOo00.OooO0O0
                public void onComplete(@NotNull OooOo videoItem) {
                    Intrinsics.checkNotNullParameter(videoItem, "videoItem");
                    svgaView.setImageDrawable(new OooO(videoItem, dynamicEntity));
                    SVGAView sVGAView = svgaView;
                    int i = loopCount;
                    if (i <= 0) {
                        i = 1;
                    }
                    sVGAView.setLoops(i);
                    svgaView.OooO0OO();
                    SVGAView sVGAView2 = svgaView;
                    final Function0<Unit> function0 = onFinish;
                    sVGAView2.setCallback(new p405o0Oo0OO0.OooO0o() { // from class: com.yalla.yalla.common.manager.RoomEffectGiftPlayer$startSvgaAnimation$1$onComplete$1
                        @Override // p405o0Oo0OO0.OooO0o
                        public void onFinished() {
                            function0.invoke();
                        }

                        @Override // p405o0Oo0OO0.OooO0o
                        public void onPause() {
                        }

                        @Override // p405o0Oo0OO0.OooO0o
                        public void onRepeat() {
                        }

                        @Override // p405o0Oo0OO0.OooO0o
                        public void onStep(int frame, double percentage) {
                        }
                    });
                }

                @Override // o0Oo0OO0.OooOo00.OooO0O0
                public void onError() {
                    onFinish.invoke();
                }
            });
        } catch (Exception unused) {
            onFinish.invoke();
        }
    }

    @JvmOverloads
    public final void addEffectGift(int i) {
        addEffectGift$default(this, i, 0, null, 6, null);
    }

    @JvmOverloads
    public final void addEffectGift(int i, int i2) {
        addEffectGift$default(this, i, i2, null, 4, null);
    }

    @JvmOverloads
    public final void addEffectGift(int giftId, int times, @Nullable String giftVideoUrl) {
        StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("addEffectGift giftId = ", giftId, "  times = ", times, "  giftVideoUrl = ");
        sbOooO0O0.append(giftVideoUrl);
        o00O00.OooO0OO("RoomEffectGiftPlayer", sbOooO0O0.toString());
        int i = 1;
        if (times < 1) {
            times = 1;
        }
        if (1 <= times) {
            while (true) {
                if (giftId == 999) {
                    this.effectGiftList.add(0, new EffectGiftModel(giftId, "", times - 1, null, 8, null));
                } else {
                    this.effectGiftList.add(new EffectGiftModel(giftId, giftVideoUrl == null ? "" : giftVideoUrl, times - 1, null, 8, null));
                }
                if (i == times) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (this.playJob == null) {
            launchPlayJob();
        }
    }

    @JvmOverloads
    public final void addEffectGiftCustomMade(int giftId, int times, @Nullable GiftRoomModel.CustomGiftInfo customGiftInfo) {
        StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("addEffectGiftCustomMade giftId = ", giftId, "  times = ", times, "  customGiftInfo = ");
        sbOooO0O0.append(customGiftInfo);
        o00O00.OooO0OO("RoomEffectGiftPlayer", sbOooO0O0.toString());
        if (times < 1) {
            times = 1;
        }
        this.effectGiftList.add(new EffectGiftModel(giftId, "", times, customGiftInfo));
        if (this.playJob == null) {
            launchPlayJob();
        }
    }

    @JvmOverloads
    public final void addEffectGiftCustomMade(int i, @Nullable GiftRoomModel.CustomGiftInfo customGiftInfo) {
        addEffectGiftCustomMade$default(this, i, 0, customGiftInfo, 2, null);
    }

    @NotNull
    public final MixedRoomActivity getActivity() {
        return this.activity;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, o0OoO0OO.o0Oo0oo] */
    public final void release() {
        this.effectGiftList.clear();
        Job job = this.playJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.playJob = null;
        AlphaVideoView alphaVideoView = this.alphaVideoView;
        PlayerController playerController = alphaVideoView.f12661Oooo0oO;
        if (playerController != null) {
            playerController.OooO0oo(playerController.OooO0Oo(6, null));
        }
        alphaVideoView.setVisibility(4);
        OooO0OO oooO0OO = alphaVideoView.f12660Oooo0o;
        if (oooO0OO != null) {
            oooO0OO.onStateChanged(PlayState.Stop);
        }
        AlphaVideoView alphaVideoView2 = this.alphaVideoView;
        PlayerController playerController2 = alphaVideoView2.f12661Oooo0oO;
        if (playerController2 != null) {
            ?? r2 = playerController2.f19837OoooO0O;
            if (r2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
            }
            r2.OooO0Oo(alphaVideoView2);
        }
        PlayerController playerController3 = alphaVideoView2.f12661Oooo0oO;
        if (playerController3 != null) {
            playerController3.OooO0oo(playerController3.OooO0Oo(7, null));
        }
        this.cocosAnimView.removeAllViews();
        getSvgaViewContainer().removeAllViews();
        this.cocosGiftController.clearGiftAnimation();
    }

    public final void reset() {
        this.effectGiftList.clear();
        Job job = this.playJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.playJob = null;
    }
}
