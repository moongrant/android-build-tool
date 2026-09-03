package p405o0Oo0OO0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.SoundPool;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.opensource.svgaplayer.proto.AudioEntity;
import com.opensource.svgaplayer.proto.MovieEntity;
import com.opensource.svgaplayer.proto.MovieParams;
import com.opensource.svgaplayer.proto.SpriteEntity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p589o0oOooO0.o0O00000;
import p589o0oOooO0.o0O00o0;
import p647o0ooOOOO.c6;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public File f39065OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public c6 f39067OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f39068OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f39069OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public List<o0O00000> f39071OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public SoundPool f39072OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public MovieEntity f39074OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f39066OooO00o = true;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public List<o0O00o0> f39070OooO0o = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public HashMap<String, Bitmap> f39073OooO0oo = new HashMap<>();

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function0 f39076Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0 function0) {
            super(0);
            this.f39076Oooo0oO = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f39076Oooo0oO.invoke();
            return Unit.INSTANCE;
        }
    }

    public OooOo(@NotNull JSONObject jSONObject, @NotNull File file) {
        Bitmap bitmapDecodeFile;
        this.f39067OooO0O0 = new c6(0.0d, 0.0d);
        this.f39068OooO0OO = 15;
        this.f39071OooO0o0 = CollectionsKt.emptyList();
        this.f39065OooO = file;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("movie");
        if (jSONObjectOptJSONObject != null) {
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("viewBox");
            if (jSONObjectOptJSONObject2 != null) {
                this.f39067OooO0O0 = new c6(jSONObjectOptJSONObject2.optDouble(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0.0d), jSONObjectOptJSONObject2.optDouble(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0.0d));
            }
            this.f39068OooO0OO = jSONObjectOptJSONObject.optInt("fps", 20);
            this.f39069OooO0Oo = jSONObjectOptJSONObject.optInt("frames", 0);
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("images");
        if (jSONObjectOptJSONObject3 != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
            Intrinsics.checkExpressionValueIsNotNull(itKeys, "imgObjects.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                BitmapFactory.Options options = Oooo0.f39098OooO00o;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                String str = this.f39065OooO.getAbsolutePath() + "/" + jSONObjectOptJSONObject3.get(next);
                Bitmap bitmapDecodeFile2 = new File(str).exists() ? BitmapFactory.decodeFile(str, options) : null;
                if (bitmapDecodeFile2 != null) {
                    this.f39073OooO0oo.put(next, bitmapDecodeFile2);
                } else {
                    String str2 = this.f39065OooO.getAbsolutePath() + "/" + next + ".png";
                    String str3 = new File(str2).exists() ? str2 : null;
                    if (str3 != null && (bitmapDecodeFile = BitmapFactory.decodeFile(str3, options)) != null) {
                        this.f39073OooO0oo.put(next, bitmapDecodeFile);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sprites");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject4 != null) {
                    arrayList.add(new o0O00000(jSONObjectOptJSONObject4));
                }
            }
        }
        this.f39071OooO0o0 = CollectionsKt.toList(arrayList);
    }

    public final void OooO00o(@NotNull Function0<Unit> function0) throws IOException {
        Set<Map.Entry<String, ByteString>> setEntrySet;
        MovieEntity movieEntity = this.f39074OooOO0;
        if (movieEntity == null) {
            ((OooOo00.OooO0OO.OooO00o) function0).invoke();
            return;
        }
        OooO00o oooO00o = new OooO00o(function0);
        List<AudioEntity> list = movieEntity.audios;
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = 0;
                SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build()).setMaxStreams(Math.min(12, list.size())).build();
                HashMap map = new HashMap();
                soundPoolBuild.setOnLoadCompleteListener(new Oooo000(intRef, list, this, oooO00o));
                HashMap map2 = new HashMap();
                Map<String, ByteString> map3 = movieEntity.images;
                if (map3 != null && (setEntrySet = map3.entrySet()) != null) {
                    Iterator<T> it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String imageKey = (String) entry.getKey();
                        byte[] byteArray = ((ByteString) entry.getValue()).OooOOO0();
                        Intrinsics.checkExpressionValueIsNotNull(byteArray, "byteArray");
                        if (byteArray.length >= 4) {
                            List<Byte> listSlice = ArraysKt.slice(byteArray, new IntRange(0, 3));
                            if (listSlice.get(0).byteValue() == 73 && listSlice.get(1).byteValue() == 68 && listSlice.get(2).byteValue() == 51 && listSlice.get(3).byteValue() == 3) {
                                Intrinsics.checkExpressionValueIsNotNull(imageKey, "imageKey");
                                map2.put(imageKey, byteArray);
                            }
                        }
                    }
                }
                if (map2.size() > 0) {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        File tmpFile = File.createTempFile((String) entry2.getKey(), ".mp3");
                        FileOutputStream fileOutputStream = new FileOutputStream(tmpFile);
                        fileOutputStream.write((byte[]) entry2.getValue());
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Object key = entry2.getKey();
                        Intrinsics.checkExpressionValueIsNotNull(tmpFile, "tmpFile");
                        map.put(key, tmpFile);
                    }
                }
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (AudioEntity audio : list) {
                    Intrinsics.checkExpressionValueIsNotNull(audio, "audio");
                    o0O00o0 o0o00o1 = new o0O00o0(audio);
                    File file = (File) map.get(audio.audioKey);
                    if (file != null) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        FileDescriptor fd = fileInputStream.getFD();
                        Integer num = audio.startTime;
                        double dIntValue = num != null ? num.intValue() : 0;
                        Integer num2 = audio.totalTime;
                        o0o00o1.f47176OooO0OO = Integer.valueOf(soundPoolBuild.load(fd, (long) ((dIntValue / ((double) (num2 != null ? num2.intValue() : 0))) * ((double) fileInputStream.available())), fileInputStream.available(), 1));
                        fileInputStream.close();
                    }
                    arrayList.add(o0o00o1);
                }
                this.f39070OooO0o = arrayList;
                this.f39072OooO0oO = soundPoolBuild;
                return;
            }
        }
        oooO00o.invoke();
    }

    public final void OooO0O0(MovieEntity movieEntity) {
        Set<Map.Entry<String, ByteString>> setEntrySet;
        Bitmap bitmapDecodeFile;
        Map<String, ByteString> map = movieEntity.images;
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            return;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String imageKey = (String) entry.getKey();
            BitmapFactory.Options options = Oooo0.f39098OooO00o;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            byte[] byteArray = ((ByteString) entry.getValue()).OooOOO0();
            Intrinsics.checkExpressionValueIsNotNull(byteArray, "byteArray");
            if (byteArray.length >= 4) {
                List<Byte> listSlice = ArraysKt.slice(byteArray, new IntRange(0, 3));
                if (listSlice.get(0).byteValue() != 73 || listSlice.get(1).byteValue() != 68 || listSlice.get(2).byteValue() != 51 || listSlice.get(3).byteValue() != 3) {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    if (bitmapDecodeByteArray != null) {
                        HashMap<String, Bitmap> map2 = this.f39073OooO0oo;
                        Intrinsics.checkExpressionValueIsNotNull(imageKey, "imageKey");
                        map2.put(imageKey, bitmapDecodeByteArray);
                    } else {
                        String str = this.f39065OooO.getAbsolutePath() + "/" + ((ByteString) entry.getValue()).OooOOO();
                        Bitmap bitmapDecodeFile2 = new File(str).exists() ? BitmapFactory.decodeFile(str, options) : null;
                        if (bitmapDecodeFile2 != null) {
                            this.f39073OooO0oo.put(imageKey, bitmapDecodeFile2);
                        } else {
                            String str2 = this.f39065OooO.getAbsolutePath() + "/" + imageKey + ".png";
                            String str3 = new File(str2).exists() ? str2 : null;
                            if (str3 != null && (bitmapDecodeFile = BitmapFactory.decodeFile(str3, options)) != null) {
                                this.f39073OooO0oo.put(imageKey, bitmapDecodeFile);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void finalize() {
        SoundPool soundPool = this.f39072OooO0oO;
        if (soundPool != null) {
            soundPool.release();
        }
        this.f39072OooO0oO = null;
        this.f39073OooO0oo.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List<o0oOooO0.o0O00000>] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    public OooOo(@NotNull MovieEntity movieEntity, @NotNull File file) {
        ?? EmptyList;
        this.f39067OooO0O0 = new c6(0.0d, 0.0d);
        this.f39068OooO0OO = 15;
        this.f39071OooO0o0 = CollectionsKt.emptyList();
        this.f39074OooOO0 = movieEntity;
        this.f39065OooO = file;
        MovieParams movieParams = movieEntity.params;
        if (movieParams != null) {
            Float f = movieParams.viewBoxWidth;
            float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            double dFloatValue = f != null ? f.floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            Float f3 = movieParams.viewBoxHeight;
            this.f39067OooO0O0 = new c6(dFloatValue, f3 != null ? f3.floatValue() : f2);
            Integer num = movieParams.fps;
            this.f39068OooO0OO = num != null ? num.intValue() : 20;
            Integer num2 = movieParams.frames;
            this.f39069OooO0Oo = num2 != null ? num2.intValue() : 0;
        }
        try {
            OooO0O0(movieEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<SpriteEntity> list = movieEntity.sprites;
        if (list != null) {
            EmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (SpriteEntity it : list) {
                Intrinsics.checkExpressionValueIsNotNull(it, "it");
                EmptyList.add(new o0O00000(it));
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        this.f39071OooO0o0 = EmptyList;
    }
}
