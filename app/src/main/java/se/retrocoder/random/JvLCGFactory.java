/* Copyright (C) 2024 skywalker<j.karlsson@retrocoder.se> */
package se.retrocoder.random;

public class JvLCGFactory {

    /**
     * Common parameters used for linear congruent generators.
     * See <a href="https://en.wikipedia.org/wiki/Linear_congruential_generator">wikipedia</a>
     */
    public enum JvLCGType {
        ZX81,                   // Modulus: 2^16,    Multiplier: 75,                  Increment: 0
        RANQD1,                 // Modulus: 2^31,    Multiplier: 1664525,             Increment: 1013904223
        BORLAND_C,              // Modulus: 2^32,    Multiplier: 22695477,            Increment: 1
        GCC,                    // Modulus: 2^32,    Multiplier: 1103515245,          Increment: 12345
        ANSI_C,                 // Modulus: 2^31,    Multiplier: 1103515245,          Increment: 12345
        DELPHI,                 // Modulus: 2^32,    Multiplier: 134775813,           Increment: 1
        TURBO_PASCAL,           // Modulus: 2^32,    Multiplier: 134775813,           Increment: 1
        MICROSOFT_VISUAL_CPP,   // Modulus: 2^32,    Multiplier: 214013,              Increment: 2531011
        MICROSOFT_VB6,          // Modulus: 2^24,    Multiplier: 16598013 ,           Increment: 12820163
        RTL_UNIFORM,            // Modulus: 2^31-1,  Multiplier: -18,                 Increment: -60
        APPLE,                  // Modulus: 2^31-1,  Multiplier: 16807,               Increment: 0
        CPP_11,                 // Modulus: 2^31-1,  Multiplier: 48271,               Increment: 0
        MMIX,                   // Modulus: 2^64,    Multiplier: 6364136223846793005, Increment: 1442695040888963407
        NEWLIB,                 // Modulus: 2^63,    Multiplier: 6364136223846793005, Increment: 1
        MUSL,                   // Modulus: 2^63,    Multiplier: 6364136223846793005, Increment: 1
        VMS,                    // Modulus: 2^32,    Multiplier: 69069,               Increment: 1
        JAVA,                   // Modulus: 2^48,    Multiplier: 25214903917,         Increment: 11
        RANDOM0,                // Modulus: 2^3*7^5, Multiplier: 8121,                Increment: 1013904223
        POSIX,                  // Modulus: 2^48,    Multiplier: 25214903917 ,        Increment: 11
        CC65_V1,                // Modulus: 2^23,    Multiplier: 65793,               Increment: 4282663
        CC65_V2,                // Modulus: 2^32,    Multiplier: 16843009 ,           Increment: 826366247
        CC65_V3,                // Modulus: 2^32,    Multiplier: 16843009 ,           Increment: 3014898611
        RANDU                   // Modulus: 2^31,    Multiplier: 65539,               Increment: 0
    }

    /**
     * Create a linear congruent generator with a Long as the state.
     *
     * @param type Type of linear congruent generator
     * @param seed Seed value
     * @return Linear congruent generator
     */
    public static JvLinearCongruentGenerator<Long> create(JvLCGType type, Long seed) {
        return switch (type) {
            case ZX81 -> new JvLinearCongruentGenerator<Long>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 75L;
                }

                @Override
                public Long getIncrement() {
                    return 0L;
                }

                @Override
                public Long getModulus() {
                    return 2L ^ 16;
                }
            });
            case RANQD1 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 1664525L;
                }

                @Override
                public Long getIncrement() {
                    return 1013904223L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 31;
                }
            });
            case BORLAND_C -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 22695477L;
                }

                @Override
                public Long getIncrement() {
                    return 1L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 32;
                }
            });
            case GCC -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 1103515245L;
                }

                @Override
                public Long getIncrement() {
                    return 12345L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 32;
                }
            });
            case ANSI_C -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 1103515245L;
                }

                @Override
                public Long getIncrement() {
                    return 12345L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 31;
                }
            });
            case DELPHI, TURBO_PASCAL -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 134775813L;
                }

                @Override
                public Long getIncrement() {
                    return 1L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 32;
                }
            });
            case MICROSOFT_VISUAL_CPP -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 214013L;
                }

                @Override
                public Long getIncrement() {
                    return 2531011L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 32;
                }
            });
            case MICROSOFT_VB6 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 16598013L;
                }

                @Override
                public Long getIncrement() {
                    return 12820163L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 24;
                }
            });
            case RTL_UNIFORM -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return -18L;
                }

                @Override
                public Long getIncrement() {
                    return -60L;
                }

                @Override
                public Long getModulus() {
                    return (1L << 31) - 1;
                }
            });
            case APPLE -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 16807L;
                }

                @Override
                public Long getIncrement() {
                    return 0L;
                }

                @Override
                public Long getModulus() {
                    return (1L << 31) - 1;
                }
            });
            case CPP_11 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 48271L;
                }

                @Override
                public Long getIncrement() {
                    return 0L;
                }

                @Override
                public Long getModulus() {
                    return (1L << 31) - 1;
                }
            });
            case MMIX -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 6364136223846793005L;
                }

                @Override
                public Long getIncrement() {
                    return 1442695040888963407L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 64;
                }
            });
            case NEWLIB, MUSL -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 6364136223846793005L;
                }

                @Override
                public Long getIncrement() {
                    return 1L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 63;
                }
            });
            case VMS -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 69069L;
                }

                @Override
                public Long getIncrement() {
                    return 1L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 32;
                }
            });
            case JAVA, POSIX -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 25214903917L;
                }

                @Override
                public Long getIncrement() {
                    return 11L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 48;
                }
            });
            case RANDOM0 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 8121L;
                }

                @Override
                public Long getIncrement() {
                    return 1013904223L;
                }

                @Override
                public Long getModulus() {
                    return 2L ^ 3 * 7 ^ 5;
                }
            });
            case CC65_V1 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 65793L;
                }

                @Override
                public Long getIncrement() {
                    return 4282663L;
                }

                @Override
                public Long getModulus() {
                    return 2L ^ 23;
                }
            });
            case CC65_V2 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 16843009L;
                }

                @Override
                public Long getIncrement() {
                    return 826366247L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 32;
                }
            });
            case CC65_V3 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 16843009L;
                }

                @Override
                public Long getIncrement() {
                    return 3014898611L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 32;
                }
            });
            case RANDU -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Long getMultiplier() {
                    return 65539L;
                }

                @Override
                public Long getIncrement() {
                    return 0L;
                }

                @Override
                public Long getModulus() {
                    return 1L << 31;
                }
            });
        };
    }

    /**
     * Create a linear congruent generator with an Integer as the state.
     *
     * @param type Type of linear congruent generator
     * @param seed Seed value
     * @return Linear congruent generator
     */
    public static JvLinearCongruentGenerator<Integer> create(JvLCGType type, Integer seed) {
        return switch (type) {
            case ZX81 -> new JvLinearCongruentGenerator<Integer>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Integer getMultiplier() {
                    return 75;
                }

                @Override
                public Integer getIncrement() {
                    return 0;
                }

                @Override
                public Integer getModulus() {
                    return 2 ^ 16;
                }
            });
            case RANQD1 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 1664525;
                }

                @Override
                public Integer getIncrement() {
                    return 1013904223;
                }

                @Override
                public Integer getModulus() {
                    return 1 << 31;
                }
            });
            case BORLAND_C -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 22695477;
                }

                @Override
                public Integer getIncrement() {
                    return 1;
                }

                @Override
                public Integer getModulus() {
                    return 1 << 32;
                }
            });
            case GCC -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 1103515245;
                }

                @Override
                public Integer getIncrement() {
                    return 12345;
                }

                @Override
                public Integer getModulus() {
                    return 1 << 32;
                }
            });
            case ANSI_C -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 1103515245;
                }

                @Override
                public Integer getIncrement() {
                    return 12345;
                }

                @Override
                public Integer getModulus() {
                    return 1 << 31;
                }
            });
            case DELPHI, TURBO_PASCAL -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 134775813;
                }

                @Override
                public Integer getIncrement() {
                    return 1;
                }

                @Override
                public Integer getModulus() {
                    return 1 << 32;
                }
            });
            case MICROSOFT_VISUAL_CPP -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 214013;
                }

                @Override
                public Integer getIncrement() {
                    return 2531011;
                }

                @Override
                public Integer getModulus() {
                    return 1 << 32;
                }
            });
            case MICROSOFT_VB6 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 16598013;
                }

                @Override
                public Integer getIncrement() {
                    return 12820163;
                }

                @Override
                public Integer getModulus() {
                    return 1 << 24;
                }
            });
            case RTL_UNIFORM -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return -18;
                }

                @Override
                public Integer getIncrement() {
                    return -60;
                }

                @Override
                public Integer getModulus() {
                    return (1 << 31) - 1;
                }
            });
            case APPLE -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 16807;
                }

                @Override
                public Integer getIncrement() {
                    return 0;
                }

                @Override
                public Integer getModulus() {
                    return (1 << 31) - 1;
                }
            });
            case CPP_11 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 48271;
                }

                @Override
                public Integer getIncrement() {
                    return 0;
                }

                @Override
                public Integer getModulus() {
                    return (1 << 31) - 1;
                }
            });
            case VMS -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 69069;
                }

                @Override
                public Integer getIncrement() {
                    return 1;
                }

                @Override
                public Integer getModulus() {
                    return 1 << 32;
                }
            });
            case RANDOM0 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 8121;
                }

                @Override
                public Integer getIncrement() {
                    return 1013904223;
                }

                @Override
                public Integer getModulus() {
                    return 2 ^ 3 * 7 ^ 5;
                }
            });
            case CC65_V1 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 65793;
                }

                @Override
                public Integer getIncrement() {
                    return 4282663;
                }

                @Override
                public Integer getModulus() {
                    return 2 ^ 23;
                }
            });
            case CC65_V2 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 16843009;
                }

                @Override
                public Integer getIncrement() {
                    return 826366247;
                }

                @Override
                public Integer getModulus() {
                    return 1 << 32;
                }
            });
            case RANDU -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Integer>() {
                @Override
                public Integer getMultiplier() {
                    return 65539;
                }

                @Override
                public Integer getIncrement() {
                    return 0;
                }

                @Override
                public Integer getModulus() {
                    return 1 << 31;
                }
            });
            case MMIX, NEWLIB, MUSL, JAVA, POSIX, CC65_V3 -> throw new IllegalArgumentException("This LCG " + type + " is not supported for Integer." +
                    "LCG parameters are to large and cannot be stored in a Integer. Use Long instead.");
        };
    }

    /**
     * Create a linear congruent generator with a Double as the state.
     *
     * @param type Type of linear congruent generator
     * @param seed Seed value
     * @return Linear congruent generator
     */
    public static JvLinearCongruentGenerator<Double> create(JvLCGType type, Double seed) {
        return switch (type) {
            case ZX81 -> new JvLinearCongruentGenerator<Double>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Double getMultiplier() {
                    return 75.0;
                }

                @Override
                public Double getIncrement() {
                    return 0.0;
                }

                @Override
                public Double getModulus() {
                    return (double) (2 ^ 16);
                }
            });
            case RANQD1 -> new JvLinearCongruentGenerator<Double>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 1664525.0;
                }

                @Override
                public Double getIncrement() {
                    return 1013904223.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1 << 31);
                }
            });
            case BORLAND_C -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 22695477.0;
                }

                @Override
                public Double getIncrement() {
                    return 1.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1L << 32);
                }
            });
            case GCC -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 1103515245.0;
                }

                @Override
                public Double getIncrement() {
                    return 12345.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1L << 32);
                }
            });
            case ANSI_C -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 1103515245.0;
                }

                @Override
                public Double getIncrement() {
                    return 12345.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1 << 31);
                }
            });
            case DELPHI, TURBO_PASCAL -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 134775813.0;
                }

                @Override
                public Double getIncrement() {
                    return 1.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1L << 32);
                }
            });
            case MICROSOFT_VISUAL_CPP -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 214013.0;
                }

                @Override
                public Double getIncrement() {
                    return 2531011.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1L << 32);
                }
            });
            case MICROSOFT_VB6 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 16598013.0;
                }

                @Override
                public Double getIncrement() {
                    return 12820163.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1 << 24);
                }
            });
            case RTL_UNIFORM -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return -18.0;
                }

                @Override
                public Double getIncrement() {
                    return -60.0;
                }

                @Override
                public Double getModulus() {
                    return (double)((1 << 31) - 1);
                }
            });
            case APPLE -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 16807.0;
                }

                @Override
                public Double getIncrement() {
                    return 0.0;
                }

                @Override
                public Double getModulus() {
                    return (double)((1 << 31) - 1);
                }
            });
            case CPP_11 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 48271.0;
                }

                @Override
                public Double getIncrement() {
                    return 0.0;
                }

                @Override
                public Double getModulus() {
                    return (double)((1 << 31) - 1);
                }
            });
            case MMIX -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 6364136223846793005.0;
                }

                @Override
                public Double getIncrement() {
                    return 1442695040888963407.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1L << 64);
                }
            });
            case NEWLIB, MUSL -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 6364136223846793005.0;
                }

                @Override
                public Double getIncrement() {
                    return 1.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1L << 63);
                }
            });
            case VMS -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 69069.0;
                }

                @Override
                public Double getIncrement() {
                    return 1.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1L << 32);
                }
            });
            case JAVA, POSIX -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 25214903917.0;
                }

                @Override
                public Double getIncrement() {
                    return 11.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1L << 48);
                }
            });
            case RANDOM0 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 8121.0;
                }

                @Override
                public Double getIncrement() {
                    return 1013904223.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(2 ^ 3 * 7 ^ 5);
                }
            });
            case CC65_V1 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 65793.0;
                }

                @Override
                public Double getIncrement() {
                    return 4282663.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(2 ^ 23);
                }
            });
            case CC65_V2 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 16843009.0;
                }

                @Override
                public Double getIncrement() {
                    return 826366247.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1L << 32);
                }
            });
            case CC65_V3 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 16843009.0;
                }

                @Override
                public Double getIncrement() {
                    return 3014898611.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1L << 32);
                }
            });
            case RANDU -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<Double>() {
                @Override
                public Double getMultiplier() {
                    return 65539.0;
                }

                @Override
                public Double getIncrement() {
                    return 0.0;
                }

                @Override
                public Double getModulus() {
                    return (double)(1 << 31);
                }
            });
        };
    }

    /**
     * Create a linear congruent generator with a Float as the state.
     *
     * @param type Type of linear congruent generator
     * @param seed Seed value
     * @return Linear congruent generator
     */
    public static JvLinearCongruentGenerator<Float> create(JvLCGType type, Float seed) {
        return switch (type) {
            case ZX81 -> new JvLinearCongruentGenerator<Float>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 75.0f;
                }

                @Override
                public Float getIncrement() {
                    return 0.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(2 ^ 16);
                }
            });
            case RANQD1 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 1664525.0f;
                }

                @Override
                public Float getIncrement() {
                    return 1013904223.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1 << 31);
                }
            });
            case BORLAND_C -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 22695477.0f;
                }

                @Override
                public Float getIncrement() {
                    return 1.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1L << 32);
                }
            });
            case GCC -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 1103515245.0f;
                }

                @Override
                public Float getIncrement() {
                    return 12345.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1L << 32);
                }
            });
            case ANSI_C -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 1103515245.0f;
                }

                @Override
                public Float getIncrement() {
                    return 12345.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1 << 31);
                }
            });
            case DELPHI, TURBO_PASCAL -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 134775813.0f;
                }

                @Override
                public Float getIncrement() {
                    return 1.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1L << 32);
                }
            });
            case MICROSOFT_VISUAL_CPP -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 214013.0f;
                }

                @Override
                public Float getIncrement() {
                    return 2531011.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1L << 32);
                }
            });
            case MICROSOFT_VB6 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 16598013.0f;
                }

                @Override
                public Float getIncrement() {
                    return 12820163.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1 << 24);
                }
            });
            case RTL_UNIFORM -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return -18.0f;
                }

                @Override
                public Float getIncrement() {
                    return -60.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)((1 << 31) - 1);
                }
            });
            case APPLE -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 16807.0f;
                }

                @Override
                public Float getIncrement() {
                    return 0.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)((1 << 31) - 1);
                }
            });
            case CPP_11 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 48271.0f;
                }

                @Override
                public Float getIncrement() {
                    return 0.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)((1 << 31) - 1);
                }
            });
            case MMIX -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 6364136223846793005.0f;
                }

                @Override
                public Float getIncrement() {
                    return 1442695040888963407.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1L << 64);
                }
            });
            case NEWLIB, MUSL -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 6364136223846793005.0f;
                }

                @Override
                public Float getIncrement() {
                    return 1.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1L << 63);
                }
            });
            case VMS -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 69069.0f;
                }

                @Override
                public Float getIncrement() {
                    return 1.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1L << 32);
                }
            });
            case JAVA, POSIX -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 25214903917.0f;
                }

                @Override
                public Float getIncrement() {
                    return 11.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1L << 48);
                }
            });
            case RANDOM0 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 8121.0f;
                }

                @Override
                public Float getIncrement() {
                    return 1013904223.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(2 ^ 3 * 7 ^ 5);
                }
            });
            case CC65_V1 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 65793.0f;
                }

                @Override
                public Float getIncrement() {
                    return 4282663.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(2 ^ 23);
                }
            });
            case CC65_V2 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 16843009.0f;
                }

                @Override
                public Float getIncrement() {
                    return 826366247.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1L << 32);
                }
            });
            case CC65_V3 -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 16843009.0f;
                }

                @Override
                public Float getIncrement() {
                    return 3014898611.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1L << 32);
                }
            });
            case RANDU -> new JvLinearCongruentGenerator<>(seed, new JvLinearCongruentGeneratorConfig<>() {
                @Override
                public Float getMultiplier() {
                    return 65539.0f;
                }

                @Override
                public Float getIncrement() {
                    return 0.0f;
                }

                @Override
                public Float getModulus() {
                    return (float)(1 << 31);
                }
            });
        };
    }
}

/* License
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */