package com.yalla.yalla.ui.activity.moment.momentSend;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000OO00;
import com.common.support.imagepicker.album.TimeStringUtilKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.album.PreviewImageActivity;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.ui.activity.moment.ExoPlayVideoActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p362o0OOo0O.OooOO0;
import p417o0OoO0.o0000O0O;
import p417o0OoO0.o000O00O;
import p488o0o00O0o.o0000;
import p488o0o00O0o.o00000O;
import p488o0o00O0o.o00000O0;
import p488o0o00O0o.o00000OO;
import p488o0o00O0o.o0000O00;
import p488o0o00O0o.o0000Ooo;
import p488o0o00O0o.o0000oo;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;
import p586o0oOooOo.q;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentSendImageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendImageAdapter.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImageAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n1864#2,3:210\n*S KotlinDebug\n*F\n+ 1 MomentSendImageAdapter.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImageAdapter\n*L\n193#1:210,3\n*E\n"})
public final class MomentSendImageAdapter extends o000O<MomentSelectMedia> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f26423OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final MomentSendActivity f26424OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f26425OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f26426OooOooo;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImageAdapter$MomentSendMediaType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "setValue", "(I)V", "Add", "Image", "Video", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum MomentSendMediaType {
        Add(0),
        Image(1),
        Video(2);

        private int value;

        MomentSendMediaType(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MomentSendImageAdapter(@NotNull MomentSendActivity activity, @NotNull ArrayList data) {
        super(activity, data);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f26424OooOoo0 = activity;
        OooO00o oooO00o = new OooO00o();
        this.f10114OooOo0O = oooO00o;
        oooO00o.OooO0O0(MomentSendMediaType.Add.getValue(), oO00OO0O.item_moment_send_add);
        oooO00o.OooO0O0(MomentSendMediaType.Image.getValue(), oO00OO0O.item_moment_send_image);
        oooO00o.OooO0O0(MomentSendMediaType.Video.getValue(), oO00OO0O.item_moment_send_video);
    }

    public static final void Oooo0o0(MomentSendImageAdapter momentSendImageAdapter, int i) {
        momentSendImageAdapter.getClass();
        ArrayList imagePathList = new ArrayList();
        Collection data = momentSendImageAdapter.f10111OooOOoo;
        Intrinsics.checkNotNullExpressionValue(data, "data");
        int i2 = 0;
        MomentSelectMedia momentSelectMedia = null;
        for (Object obj : data) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MomentSelectMedia momentSelectMedia2 = (MomentSelectMedia) obj;
            OooOOO0.OooO0O0("WRM showBigImage itemModel = " + momentSelectMedia2);
            if (i2 == i) {
                momentSelectMedia = momentSelectMedia2;
            }
            if (momentSelectMedia2 != null && !TextUtils.isEmpty(momentSelectMedia2.getPath())) {
                imagePathList.add(momentSelectMedia2.getPath());
            }
            i2 = i3;
        }
        long duration = momentSelectMedia != null ? momentSelectMedia.getDuration() : 0L;
        MomentSendActivity activity = momentSendImageAdapter.f26424OooOoo0;
        if (duration <= 0) {
            o0OO000.OooO0O0("106106", MapsKt.mapOf(TuplesKt.to("type", 2)));
            int i4 = PreviewImageActivity.f22538OooO0o0;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(imagePathList, "imagePathList");
            Intent intent = new Intent(activity, (Class<?>) PreviewImageActivity.class);
            intent.putExtra("File_Index", i);
            intent.putExtra("data", imagePathList);
            activity.startActivity(intent);
            return;
        }
        o0OO000.OooO0O0("106106", MapsKt.mapOf(TuplesKt.to("type", 1)));
        int i5 = ExoPlayVideoActivity.f26041OooO0o;
        String source = momentSelectMedia != null ? momentSelectMedia.getPath() : null;
        Intrinsics.checkNotNull(source);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(source, "source");
        Intent intent2 = new Intent(activity, (Class<?>) ExoPlayVideoActivity.class);
        intent2.putExtra("source_uri", source);
        activity.startActivity(intent2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0183  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) throws Throwable {
        InputStream fileInputStream;
        String str;
        Object[] objArr;
        NetImageView netImageView;
        Uri uriOooO0O0;
        o000O00O.OooO00o oooO00o;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        MomentSelectMedia item = (MomentSelectMedia) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemViewType = helper.getItemViewType();
        if (itemViewType == MomentSendMediaType.Video.getValue()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) helper.getView(oO00O0oO.item_moment_send_video_layout);
            NetImageView setItemVideo$lambda$1 = (NetImageView) helper.getView(oO00O0oO.item_moment_send_video_image);
            Intrinsics.checkNotNullExpressionValue(setItemVideo$lambda$1, "setItemVideo$lambda$1");
            o000OO00.OooO(setItemVideo$lambda$1, new o0000oo(this, helper));
            o000O00O.OooO00o oooO00o2 = o000O00O.f45507OooO00o;
            o0000Ooo o0000ooo = new o0000Ooo(item, constraintLayout, setItemVideo$lambda$1, this);
            Intrinsics.checkNotNullParameter(item, "<this>");
            double width = ((double) item.getWidth()) / ((double) item.getHeight());
            if (width <= 0.6666666666666666d) {
                oooO00o = o000O00O.f45507OooO00o;
            } else if (0.6666666666666666d >= width || width >= 1.0d) {
                boolean z = width == 1.0d;
                o000O00O.OooO00o oooO00o3 = o000O00O.f45509OooO0OO;
                if (z) {
                    oooO00o = oooO00o3;
                } else if (1.5d > width && width > 1.0d) {
                    oooO00o = o000O00O.f45510OooO0Oo;
                } else if (width >= 1.5d) {
                    oooO00o = o000O00O.f45511OooO0o0;
                } else {
                    oooO00o = oooO00o3;
                }
            } else {
                oooO00o = o000O00O.f45508OooO0O0;
            }
            o0000ooo.invoke(oooO00o);
            ImageView imageView = (ImageView) helper.getView(oO00O0oO.item_moment_send_video_del);
            imageView.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(imageView, "this");
            o000OO00.OooO(imageView, new o0000(this, helper));
            ImageView imageView2 = (ImageView) helper.getView(oO00O0oO.item_moment_send_video_play);
            imageView2.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(imageView2, "this");
            o000OO00.OooO(imageView2, new o0000O00(this, helper));
            TextView textView = (TextView) helper.getView(oO00O0oO.item_moment_send_video_duration);
            textView.setVisibility(0);
            textView.setText("");
            if (item.getDuration() > 0) {
                if (o0000O0O.OooO0Oo(item.getPath())) {
                    textView.setText(TimeStringUtilKt.formatDurationTime(item.getDuration() / 1000));
                    return;
                } else {
                    textView.setText(TimeStringUtilKt.formatDurationTime(item.getDuration()));
                    return;
                }
            }
            return;
        }
        if (itemViewType != MomentSendMediaType.Image.getValue()) {
            ImageView imageView3 = (ImageView) helper.getView(oO00O0oO.item_moment_send_add);
            imageView3.setVisibility(0);
            imageView3.setImageResource(oOo00OO0.icon_photo_add);
            Intrinsics.checkNotNullExpressionValue(imageView3, "this");
            o000OO00.OooO(imageView3, new o00000O0(this));
            return;
        }
        ImageView imageView4 = (ImageView) helper.getView(oO00O0oO.item_moment_send_image_del);
        imageView4.setVisibility(0);
        Intrinsics.checkNotNullExpressionValue(imageView4, "this");
        o000OO00.OooO(imageView4, new o00000O(item, this, helper));
        TextView textView2 = (TextView) helper.getView(oO00O0oO.item_moment_send_image_gif);
        textView2.setVisibility(8);
        String upperCase = item.getPath().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        Context context = textView2.getContext();
        HashMap<String, String> map = o0oo0000.OooO00o.f56798OooO00o;
        InputStream inputStream = null;
        strOooO00o = null;
        String strOooO00o = null;
        try {
            fileInputStream = (Build.VERSION.SDK_INT < 29 || (uriOooO0O0 = q.OooO0O0(context, upperCase)) == null) ? new FileInputStream(upperCase) : context.getContentResolver().openInputStream(uriOooO0O0);
            try {
                try {
                    byte[] bArr = new byte[4];
                    fileInputStream.read(bArr, 0, 4);
                    strOooO00o = o0oo0000.OooO00o.OooO00o(bArr);
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                    }
                    str = map.get(TextUtils.isEmpty(strOooO00o) ? "" : strOooO00o.toUpperCase());
                    if (TextUtils.isEmpty(str)) {
                        objArr = false;
                    } else {
                        objArr = false;
                    }
                    if (objArr != false) {
                        textView2.setVisibility(0);
                    }
                    netImageView = (NetImageView) helper.getView(oO00O0oO.item_moment_send_image_image);
                    netImageView.setVisibility(0);
                    if (o0000O0O.OooO0Oo(item.getPath())) {
                        OooOO0.OooO00o oooO00o4 = new OooOO0.OooO00o(netImageView.getContext());
                        oooO00o4.OooO00o(OooO.OooO0Oo());
                        oooO00o4.f43936OooOoo0 = 2;
                        oooO00o4.f43926OooOOoo = 1;
                        oooO00o4.OooO0o0(6);
                        oooO00o4.f43911OooO0OO = item.getPath();
                        oooO00o4.f43909OooO00o = 0;
                        oooO00o4.f43914OooO0o0 = true;
                        oooO00o4.OooO0Oo(netImageView);
                    } else {
                        OooOO0.OooO00o oooO00o5 = new OooOO0.OooO00o(netImageView.getContext());
                        oooO00o5.OooO00o(OooO.OooO0Oo());
                        oooO00o5.f43911OooO0OO = item.getPath();
                        oooO00o5.f43909OooO00o = 0;
                        oooO00o5.OooO0o0(6);
                        oooO00o5.OooO0Oo(netImageView);
                    }
                    Intrinsics.checkNotNullExpressionValue(netImageView, "this");
                    o000OO00.OooO(netImageView, new o00000OO(this, helper));
                }
            } catch (Throwable th) {
                th = th;
                inputStream = fileInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
        try {
            fileInputStream.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        str = map.get(TextUtils.isEmpty(strOooO00o) ? "" : strOooO00o.toUpperCase());
        if (TextUtils.isEmpty(str) || !"gif".equals(str.toLowerCase())) {
            objArr = false;
        } else {
            objArr = true;
        }
        if (objArr != false) {
            textView2.setVisibility(0);
        }
        netImageView = (NetImageView) helper.getView(oO00O0oO.item_moment_send_image_image);
        netImageView.setVisibility(0);
        if (o0000O0O.OooO0Oo(item.getPath())) {
            OooOO0.OooO00o oooO00o6 = new OooOO0.OooO00o(netImageView.getContext());
            oooO00o6.OooO00o(OooO.OooO0Oo());
            oooO00o6.f43936OooOoo0 = 2;
            oooO00o6.f43926OooOOoo = 1;
            oooO00o6.OooO0o0(6);
            oooO00o6.f43911OooO0OO = item.getPath();
            oooO00o6.f43909OooO00o = 0;
            oooO00o6.f43914OooO0o0 = true;
            oooO00o6.OooO0Oo(netImageView);
        } else {
            OooOO0.OooO00o oooO00o7 = new OooOO0.OooO00o(netImageView.getContext());
            oooO00o7.OooO00o(OooO.OooO0Oo());
            oooO00o7.f43911OooO0OO = item.getPath();
            oooO00o7.f43909OooO00o = 0;
            oooO00o7.OooO0o0(6);
            oooO00o7.OooO0Oo(netImageView);
        }
        Intrinsics.checkNotNullExpressionValue(netImageView, "this");
        o000OO00.OooO(netImageView, new o00000OO(this, helper));
    }
}
