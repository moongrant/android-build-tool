package p516o0o0O000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p386o0OOoo0O.o00;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p515o0o0O00.o00O00;
import p522o0o0O0o.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OOO0o f42120OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f42121OooO0O0 = LazyKt.lazy(OooOO0.f42122Oooo0o);

    @StabilityInferred(parameters = 0)
    public static final class OooO extends o00O0<String> {
        public static final int $stable = 0;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[JsonToken.values().length];
                iArr[JsonToken.NULL.ordinal()] = 1;
                iArr[JsonToken.BOOLEAN.ordinal()] = 2;
                iArr[JsonToken.NUMBER.ordinal()] = 3;
                iArr[JsonToken.STRING.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // p386o0OOoo0O.o00O0
        @NotNull
        public String read(@Nullable JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader != null ? jsonReader.peek() : null;
            int i = jsonTokenPeek == null ? -1 : OooO00o.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
            if (i == 1) {
                jsonReader.nextNull();
                return "";
            }
            if (i == 2) {
                return String.valueOf(jsonReader.nextBoolean());
            }
            if (i != 3 && i != 4) {
                return "";
            }
            String strNextString = jsonReader.nextString();
            Intrinsics.checkNotNullExpressionValue(strNextString, "reader.nextString()");
            return strNextString;
        }

        @Override // p386o0OOoo0O.o00O0
        public void write(@Nullable JsonWriter jsonWriter, @Nullable String str) throws IOException {
            if (jsonWriter != null) {
                if (str == null) {
                    str = "";
                }
                jsonWriter.value(str);
            }
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO00o extends o00O0<Boolean> {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: o0o0O000.o0OOO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0400OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[JsonToken.values().length];
                iArr[JsonToken.NULL.ordinal()] = 1;
                iArr[JsonToken.BOOLEAN.ordinal()] = 2;
                iArr[JsonToken.NUMBER.ordinal()] = 3;
                iArr[JsonToken.STRING.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p386o0OOoo0O.o00O0
        @NotNull
        public Boolean read(@Nullable JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader != null ? jsonReader.peek() : null;
            int i = jsonTokenPeek == null ? -1 : C0400OooO00o.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
            boolean zNextBoolean = false;
            if (i == 1) {
                jsonReader.nextNull();
            } else if (i == 2) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (i != 3) {
                if (i == 4) {
                    String strNextString = jsonReader.nextString();
                    return Boolean.valueOf(Intrinsics.areEqual(strNextString, "1") || StringsKt.OooO(strNextString, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE));
                }
            } else if (jsonReader.nextInt() == 1) {
                zNextBoolean = true;
            }
            return Boolean.valueOf(zNextBoolean);
        }

        @Override // p386o0OOoo0O.o00O0
        public void write(@Nullable JsonWriter jsonWriter, @Nullable Boolean bool) throws IOException {
            if (bool == null) {
                if (jsonWriter != null) {
                    jsonWriter.value(false);
                }
            } else if (jsonWriter != null) {
                jsonWriter.value(bool.booleanValue());
            }
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 extends o00O0<Double> {
        public static final int $stable = 0;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[JsonToken.values().length];
                iArr[JsonToken.NULL.ordinal()] = 1;
                iArr[JsonToken.BOOLEAN.ordinal()] = 2;
                iArr[JsonToken.NUMBER.ordinal()] = 3;
                iArr[JsonToken.STRING.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p386o0OOoo0O.o00O0
        @NotNull
        public Double read(@Nullable JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader != null ? jsonReader.peek() : null;
            int i = jsonTokenPeek == null ? -1 : OooO00o.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
            double dNextDouble = 0.0d;
            if (i == 1) {
                jsonReader.nextNull();
            } else if (i != 2) {
                if (i == 3) {
                    dNextDouble = jsonReader.nextDouble();
                } else if (i == 4) {
                    try {
                        String strNextString = jsonReader.nextString();
                        Intrinsics.checkNotNullExpressionValue(strNextString, "reader.nextString()");
                        dNextDouble = Double.parseDouble(strNextString);
                    } catch (Exception unused) {
                    }
                    return Double.valueOf(dNextDouble);
                }
            } else if (jsonReader.nextBoolean()) {
                dNextDouble = 1.0d;
            }
            return Double.valueOf(dNextDouble);
        }

        @Override // p386o0OOoo0O.o00O0
        public void write(@Nullable JsonWriter jsonWriter, @Nullable Double d) throws IOException {
            if (jsonWriter != null) {
                jsonWriter.value(d != null ? d.doubleValue() : 0.0d);
            }
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0OO extends o00O0<Integer> {
        public static final int $stable = 0;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[JsonToken.values().length];
                iArr[JsonToken.NULL.ordinal()] = 1;
                iArr[JsonToken.BOOLEAN.ordinal()] = 2;
                iArr[JsonToken.NUMBER.ordinal()] = 3;
                iArr[JsonToken.STRING.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p386o0OOoo0O.o00O0
        @NotNull
        public Integer read(@Nullable JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader != null ? jsonReader.peek() : null;
            int i = jsonTokenPeek == null ? -1 : OooO00o.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
            int iNextInt = 1;
            int i2 = 0;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        iNextInt = jsonReader.nextInt();
                    } else if (i == 4) {
                        try {
                            String strNextString = jsonReader.nextString();
                            Intrinsics.checkNotNullExpressionValue(strNextString, "reader.nextString()");
                            i2 = Integer.parseInt(strNextString);
                        } catch (Exception unused) {
                        }
                        return Integer.valueOf(i2);
                    }
                } else if (!jsonReader.nextBoolean()) {
                }
                return Integer.valueOf(iNextInt);
            }
            jsonReader.nextNull();
            iNextInt = 0;
            return Integer.valueOf(iNextInt);
        }

        @Override // p386o0OOoo0O.o00O0
        public void write(@Nullable JsonWriter jsonWriter, @Nullable Integer num) throws IOException {
            if (jsonWriter != null) {
                jsonWriter.value(Integer.valueOf(num != null ? num.intValue() : 0));
            }
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0o extends o00O0<Long> {
        public static final int $stable = 0;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[JsonToken.values().length];
                iArr[JsonToken.NULL.ordinal()] = 1;
                iArr[JsonToken.BOOLEAN.ordinal()] = 2;
                iArr[JsonToken.NUMBER.ordinal()] = 3;
                iArr[JsonToken.STRING.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p386o0OOoo0O.o00O0
        @NotNull
        public Long read(@Nullable JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader != null ? jsonReader.peek() : null;
            int i = jsonTokenPeek == null ? -1 : OooO00o.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
            long jNextLong = 0;
            if (i == 1) {
                jsonReader.nextNull();
            } else if (i != 2) {
                if (i == 3) {
                    jNextLong = jsonReader.nextLong();
                } else if (i == 4) {
                    try {
                        String strNextString = jsonReader.nextString();
                        Intrinsics.checkNotNullExpressionValue(strNextString, "reader.nextString()");
                        jNextLong = Long.parseLong(strNextString);
                    } catch (Exception unused) {
                    }
                    return Long.valueOf(jNextLong);
                }
            } else if (jsonReader.nextBoolean()) {
                jNextLong = 1;
            }
            return Long.valueOf(jNextLong);
        }

        @Override // p386o0OOoo0O.o00O0
        public void write(@Nullable JsonWriter jsonWriter, @Nullable Long l) throws IOException {
            if (jsonWriter != null) {
                jsonWriter.value(l != null ? l.longValue() : 0L);
            }
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<o000OOo0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f42122Oooo0o = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000OOo0 invoke() {
            o00 o00Var = new o00();
            o00Var.OooO0O0(Boolean.TYPE, new OooO00o());
            o00Var.OooO0O0(String.class, new OooO());
            o00Var.OooO0O0(Integer.TYPE, new OooO0OO());
            o00Var.OooO0O0(Double.TYPE, new OooO0O0());
            o00Var.OooO0O0(Long.TYPE, new OooO0o());
            return o00Var.OooO00o();
        }
    }

    @NotNull
    public static final o000OOo0 OooO00o() {
        Object value = f42121OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-gson>(...)");
        return (o000OOo0) value;
    }

    @Nullable
    public static final Object OooO0O0(@NotNull String json, @NotNull Class type) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            return OooO00o().OooO0OO(json, type);
        } catch (Exception e) {
            o00O00.OooO0Oo("JSON转换异常:Class<T> \n-> " + e);
            oo0oOO0.OooO0O0("JSON Transform Exception :Class<T> \n-> " + type);
            return null;
        }
    }

    @Nullable
    public static final Object OooO0OO(@NotNull String json, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            return OooO00o().OooO0Oo(json, type);
        } catch (Exception e) {
            o00O00.OooO0Oo("JSON转换异常:Type \n-> " + e);
            oo0oOO0.OooO0O0("JSON Transform Exception:Type \n-> " + type);
            return null;
        }
    }
}
