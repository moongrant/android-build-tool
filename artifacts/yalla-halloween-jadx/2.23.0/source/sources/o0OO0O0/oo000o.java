package o0OO0O0;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.SoundPool;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.opensource.svgaplayer.SVGACache;
import com.opensource.svgaplayer.proto.AudioEntity;
import com.opensource.svgaplayer.proto.MovieEntity;
import com.opensource.svgaplayer.proto.MovieParams;
import com.opensource.svgaplayer.proto.SpriteEntity;
import java.io.File;
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
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSVGAVideoEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGAVideoEntity.kt\ncom/opensource/svgaplayer/SVGAVideoEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,348:1\n1#2:349\n32#3,2:350\n1855#4,2:352\n1549#4:354\n1620#4,3:355\n1549#4:358\n1620#4,3:359\n1855#4,2:366\n1855#4,2:368\n215#5,2:362\n215#5,2:364\n*S KotlinDebug\n*F\n+ 1 SVGAVideoEntity.kt\ncom/opensource/svgaplayer/SVGAVideoEntity\n*L\n122#1:350,2\n153#1:352,2\n187#1:354\n187#1:355,3\n205#1:358\n205#1:359,3\n271#1:366,2\n335#1:368,2\n221#1:362,2\n257#1:364,2\n*E\n"})
public final class oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public SoundPool f43116OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f43117OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f43118OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final MovieEntity f43119OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public p330o0OO0Ooo.OooO f43120OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f43121OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f43122OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public List<p384o0OOooO0.oo000o> f43123OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public List<p384o0OOooO0.o0OoOo0> f43124OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Bitmap> f43125OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final File f43126OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f43127OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Function0<Unit> f43128OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f43129OooOOO0;

    public oo000o(@NotNull JSONObject json, @NotNull File cacheDir) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        this.f43117OooO00o = "SVGAVideoEntity";
        this.f43118OooO0O0 = true;
        this.f43120OooO0Oo = new p330o0OO0Ooo.OooO(0.0d, 0.0d);
        this.f43122OooO0o0 = 15;
        this.f43123OooO0oO = CollectionsKt.emptyList();
        this.f43124OooO0oo = CollectionsKt.emptyList();
        this.f43125OooOO0 = new HashMap<>();
        this.f43129OooOOO0 = 0;
        this.f43127OooOO0o = 0;
        this.f43126OooOO0O = cacheDir;
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("movie");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("viewBox");
        if (jSONObjectOptJSONObject2 != null) {
            this.f43120OooO0Oo = new p330o0OO0Ooo.OooO(jSONObjectOptJSONObject2.optDouble(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0.0d), jSONObjectOptJSONObject2.optDouble(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0.0d));
        }
        this.f43122OooO0o0 = jSONObjectOptJSONObject.optInt("fps", 20);
        this.f43121OooO0o = jSONObjectOptJSONObject.optInt("frames", 0);
        try {
            OooO0OO(json);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("sprites");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject3 != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject3, "optJSONObject(i)");
                    arrayList.add(new p384o0OOooO0.oo000o(jSONObjectOptJSONObject3));
                }
            }
        }
        this.f43123OooO0oO = CollectionsKt.toList(arrayList);
    }

    public final String OooO00o(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        File file = this.f43126OooOO0O;
        sb.append(file.getAbsolutePath());
        sb.append('/');
        sb.append(str);
        String string = sb.toString();
        String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(string, ".png");
        String str3 = file.getAbsolutePath() + '/' + str2 + ".png";
        if (new File(string).exists()) {
            return string;
        }
        if (new File(strOooO00o).exists()) {
            return strOooO00o;
        }
        return new File(str3).exists() ? str3 : "";
    }

    public final void OooO0O0(MovieEntity movieEntity) {
        Set<Map.Entry<String, ByteString>> setEntrySet;
        Map<String, ByteString> map = movieEntity.images;
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            return;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            byte[] bArrOooOOoo = ((ByteString) entry.getValue()).OooOOoo();
            if (bArrOooOOoo.length >= 4) {
                List<Byte> listSlice = ArraysKt.slice(bArrOooOOoo, new IntRange(0, 3));
                if (listSlice.get(0).byteValue() != 73 || listSlice.get(1).byteValue() != 68 || listSlice.get(2).byteValue() != 51) {
                    String strOooOo00 = ((ByteString) entry.getValue()).OooOo00();
                    Object key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                    String strOooO00o = OooO00o(strOooOo00, (String) key);
                    o0OO0O0O.OooO00o oooO00o = o0OO0O0O.OooO00o.f43130OooO00o;
                    int i = this.f43129OooOOO0;
                    int i2 = this.f43127OooOO0o;
                    Bitmap bitmapOooO00o = oooO00o.OooO00o(i, i2, bArrOooOOoo);
                    if (bitmapOooO00o == null) {
                        bitmapOooO00o = o0OO0O0O.OooO0OO.f43131OooO00o.OooO00o(i, i2, strOooO00o);
                    }
                    if (bitmapOooO00o != null) {
                        Object key2 = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key2, "entry.key");
                        this.f43125OooOO0.put((String) key2, bitmapOooO00o);
                    }
                }
            }
        }
    }

    public final void OooO0OO(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("images");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "imgJson.keys()");
        while (itKeys.hasNext()) {
            String imgKey = itKeys.next();
            String string = jSONObjectOptJSONObject.get(imgKey).toString();
            Intrinsics.checkNotNullExpressionValue(imgKey, "imgKey");
            String strOooO00o = OooO00o(string, imgKey);
            if (strOooO00o.length() == 0) {
                return;
            }
            String strOooOoO = StringsKt.OooOoO(imgKey, ".matte", "");
            Bitmap bitmapOooO00o = o0OO0O0O.OooO0OO.f43131OooO00o.OooO00o(this.f43129OooOOO0, this.f43127OooOO0o, strOooO00o);
            if (bitmapOooO00o != null) {
                this.f43125OooOO0.put(strOooOoO, bitmapOooO00o);
            }
        }
    }

    public final void OooO0Oo(@NotNull Function0 callback) throws IOException {
        SoundPool soundPoolBuild;
        File file;
        Set<Map.Entry<String, ByteString>> setEntrySet;
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f43128OooOOO = callback;
        final MovieEntity movieEntity = this.f43119OooO0OO;
        if (movieEntity == null) {
            callback.invoke();
            return;
        }
        Intrinsics.checkNotNull(movieEntity);
        final o00Ooo o00ooo2 = new o00Ooo(this);
        List<AudioEntity> list = movieEntity.audios;
        if (list == null || list.isEmpty()) {
            o00ooo2.invoke();
            return;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        o00O0O.f43110OooO00o.getClass();
        try {
            SoundPool.Builder audioAttributes = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build());
            List<AudioEntity> list2 = movieEntity.audios;
            Intrinsics.checkNotNullExpressionValue(list2, "entity.audios");
            soundPoolBuild = audioAttributes.setMaxStreams(RangesKt.coerceAtMost(12, list2.size())).build();
        } catch (Exception error) {
            String tag = this.f43117OooO00o;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(error, "error");
            soundPoolBuild = null;
        }
        this.f43116OooO = soundPoolBuild;
        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("pool_start", "msg");
        SoundPool soundPool = this.f43116OooO;
        if (soundPool != null) {
            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: o0OO0O0.o00Oo0
                @Override // android.media.SoundPool.OnLoadCompleteListener
                public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                    Ref.IntRef soundLoaded = intRef;
                    Intrinsics.checkNotNullParameter(soundLoaded, "$soundLoaded");
                    MovieEntity entity = movieEntity;
                    Intrinsics.checkNotNullParameter(entity, "$entity");
                    Function0 completionBlock = o00ooo2;
                    Intrinsics.checkNotNullParameter(completionBlock, "$completionBlock");
                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("pool_complete", "msg");
                    int i3 = soundLoaded.element + 1;
                    soundLoaded.element = i3;
                    List<AudioEntity> list3 = entity.audios;
                    Intrinsics.checkNotNullExpressionValue(list3, "entity.audios");
                    if (i3 >= list3.size()) {
                        completionBlock.invoke();
                    }
                }
            });
        }
        HashMap map = new HashMap();
        Map<String, ByteString> map2 = movieEntity.images;
        if (map2 != null && (setEntrySet = map2.entrySet()) != null) {
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String imageKey = (String) entry.getKey();
                byte[] bArrOooOOoo = ((ByteString) entry.getValue()).OooOOoo();
                if (bArrOooOOoo.length >= 4) {
                    List<Byte> listSlice = ArraysKt.slice(bArrOooOOoo, new IntRange(0, 3));
                    if (listSlice.get(0).byteValue() == 73 && listSlice.get(1).byteValue() == 68 && listSlice.get(2).byteValue() == 51) {
                        Intrinsics.checkNotNullExpressionValue(imageKey, "imageKey");
                        map.put(imageKey, bArrOooOOoo);
                    } else if (listSlice.get(0).byteValue() == -1 && listSlice.get(1).byteValue() == -5 && listSlice.get(2).byteValue() == -108) {
                        Intrinsics.checkNotNullExpressionValue(imageKey, "imageKey");
                        map.put(imageKey, bArrOooOOoo);
                    }
                }
            }
        }
        HashMap map3 = new HashMap();
        if (map.size() > 0) {
            for (Map.Entry entry2 : map.entrySet()) {
                SVGACache.Type type = SVGACache.f21257OooO00o;
                String audio = (String) entry2.getKey();
                Intrinsics.checkNotNullParameter(audio, "audio");
                File file2 = new File(SVGACache.OooO0o0() + audio + ".mp3");
                Object key = entry2.getKey();
                File file3 = file2.exists() ? file2 : null;
                if (file3 == null) {
                    byte[] bArr = (byte[]) entry2.getValue();
                    file2.createNewFile();
                    new FileOutputStream(file2).write(bArr);
                } else {
                    file2 = file3;
                }
                map3.put(key, file2);
            }
        }
        if (map3.size() == 0) {
            o00ooo2.invoke();
            return;
        }
        List<AudioEntity> list3 = movieEntity.audios;
        Intrinsics.checkNotNullExpressionValue(list3, "entity.audios");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        for (AudioEntity audio2 : list3) {
            Intrinsics.checkNotNullExpressionValue(audio2, "audio");
            p384o0OOooO0.o0OoOo0 o0oooo0 = new p384o0OOooO0.o0OoOo0(audio2);
            Integer num = audio2.startTime;
            double dIntValue = num != null ? num.intValue() : 0;
            Integer num2 = audio2.totalTime;
            double dIntValue2 = num2 != null ? num2.intValue() : 0;
            if (((int) dIntValue2) != 0 && (file = (File) map3.get(audio2.audioKey)) != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    double dAvailable = fileInputStream.available();
                    long j = (long) ((dIntValue / dIntValue2) * dAvailable);
                    o00O0O.f43110OooO00o.getClass();
                    SoundPool soundPool2 = this.f43116OooO;
                    o0oooo0.f44329OooO0OO = soundPool2 != null ? Integer.valueOf(soundPool2.load(fileInputStream.getFD(), j, (long) dAvailable, 1)) : null;
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileInputStream, th);
                        throw th2;
                    }
                }
            }
            arrayList.add(o0oooo0);
        }
        this.f43124OooO0oo = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List<o0OOooO0.oo000o>] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    public oo000o(@NotNull MovieEntity entity, @NotNull File cacheDir) {
        ?? EmptyList;
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        this.f43117OooO00o = "SVGAVideoEntity";
        this.f43118OooO0O0 = true;
        this.f43120OooO0Oo = new p330o0OO0Ooo.OooO(0.0d, 0.0d);
        this.f43122OooO0o0 = 15;
        this.f43123OooO0oO = CollectionsKt.emptyList();
        this.f43124OooO0oo = CollectionsKt.emptyList();
        this.f43125OooOO0 = new HashMap<>();
        this.f43129OooOOO0 = 0;
        this.f43127OooOO0o = 0;
        this.f43126OooOO0O = cacheDir;
        this.f43119OooO0OO = entity;
        MovieParams movieParams = entity.params;
        if (movieParams != null) {
            Float f = movieParams.viewBoxWidth;
            double dFloatValue = f != null ? f.floatValue() : 0.0f;
            Float f2 = movieParams.viewBoxHeight;
            this.f43120OooO0Oo = new p330o0OO0Ooo.OooO(dFloatValue, f2 != null ? f2.floatValue() : 0.0f);
            Integer num = movieParams.fps;
            this.f43122OooO0o0 = num == null ? 20 : num.intValue();
            Integer num2 = movieParams.frames;
            this.f43121OooO0o = num2 != null ? num2.intValue() : 0;
        }
        try {
            OooO0O0(entity);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        List<SpriteEntity> list = entity.sprites;
        if (list != null) {
            EmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (SpriteEntity it : list) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                EmptyList.add(new p384o0OOooO0.oo000o(it));
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        this.f43123OooO0oO = EmptyList;
    }
}
