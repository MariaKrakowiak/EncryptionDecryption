package encryptdecrypt;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        boolean decrypter = false;
        String data = "";
        String in = "";
        String out = "";
        String alg = "";
        int key = 0;
        for (int i = 1; i < args.length; i += 2) {
            if (args[i].equals("dec") && args[i - 1].equals("-mode")) {
                decrypter = true;
            }

            if ((args[i - 1]).equals("-data")) {
                data = args[i];
            }
            if ((args[i - 1]).equals("-in")) {
                in = args[i];
            }
            if ((args[i - 1]).equals("-out")) {
                out = args[i];
            }
            if ((args[i]).equals("unicode") && (args[i - 1]).equals("-alg")) {
                alg = args[i];
            }
            if ((args[i]).equals("shift") && (args[i - 1]).equals("-alg")) {
                alg = args[i];
            }


            if ((args[i]).matches("\\d+") && (args[i - 1]).equals("-key")) {
                key = Integer.parseInt(args[i]);
            }

        }

        if (!decrypter && alg.equals("unicode")) {
            if (out.equals("")) {
                if (data.equals("") && !in.equals("")) {
                    File file = new File(in);
                    Scanner scanner = new Scanner(file);
                    String lin = scanner.nextLine();
                    System.out.println(encryptUnicode(lin, key));
                    scanner.close();
                } else if (!data.equals("") && in.equals("")) {
                    System.out.println(encryptUnicode(data, key));
                } else if (!data.equals("") && in != "") {
                    System.out.println(encryptUnicode(data, key));
                }
            } else {
                if (data.equals("") && !in.equals("")) {
                    File file = new File(in);

                    Scanner scanner = new Scanner(file);
                    String lin = scanner.nextLine().trim();
                    String l = encryptUnicode(lin, key);
                    scanner.close();
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    writer.write(l);

                    writer.close();
                } else if (!data.equals("") && in.equals("")) {
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    String l = encryptUnicode(data, key);
                    writer.write(l);
                    writer.close();
                } else if (!data.equals("") && !in.equals("")) {
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    String l = encryptUnicode(data, key);
                    writer.write(l);
                    writer.close();
                }
            }
        }
        if (decrypter && alg.equals("unicode")) {
            if (out.equals("")) {
                if (data.equals("") && !in.equals("")) {
                    File file = new File(in);
                    Scanner scanner = new Scanner(file);
                    String lin = scanner.nextLine();
                    System.out.println(decryptUnicode(lin, key));
                    scanner.close();
                } else if (!data.equals("") && in.equals("")) {
                    System.out.println(decryptUnicode(data, key));
                } else if (!data.equals("") && !in.equals("")) {
                    System.out.println(decryptUnicode(data, key));
                }
            } else {
                if (data.equals("") && !in.equals("")) {
                    File file = new File(in);
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    Scanner scanner = new Scanner(file);
                    String lin = scanner.nextLine();
                    String l = decryptUnicode(lin, key);
                    writer.write(l);
                    scanner.close();
                    writer.close();

                } else if (!data.equals("") && in.equals("")) {
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    String l = decryptUnicode(data, key);
                    writer.write(l);
                    writer.close();
                } else if (!data.equals("") && !in.equals("")) {
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    String l = decryptUnicode(data, key);
                    writer.write(l);
                    writer.close();
                }
            }
        }

        if (!decrypter && alg.equals("unicode")) {
            if (out.equals("")) {
                if (data.equals("") && !in.equals("")) {
                    File file = new File(in);
                    Scanner scanner = new Scanner(file);
                    String lin = scanner.nextLine();
                    System.out.println(encryptUnicode(lin, key));
                    scanner.close();
                } else if (!data.equals("") && in.equals("")) {
                    System.out.println(encryptUnicode(data, key));
                } else if (!data.equals("") && in != "") {
                    System.out.println(encryptUnicode(data, key));
                }
            } else {
                if (data.equals("") && !in.equals("")) {
                    File file = new File(in);

                    Scanner scanner = new Scanner(file);
                    String lin = scanner.nextLine().trim();
                    String l = encryptUnicode(lin, key);
                    scanner.close();
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    writer.write(l);

                    writer.close();
                } else if (!data.equals("") && in.equals("")) {
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    String l = encryptUnicode(data, key);
                    writer.write(l);
                    writer.close();
                } else if (!data.equals("") && !in.equals("")) {
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    String l = encryptUnicode(data, key);
                    writer.write(l);
                    writer.close();
                }
            }
        }
        if (decrypter && alg.equals("shift")) {
            if (out.equals("")) {
                if (data.equals("") && !in.equals("")) {
                    File file = new File(in);
                    Scanner scanner = new Scanner(file);
                    String lin = scanner.nextLine();
                    System.out.println(decrypt(lin, key));
                    scanner.close();
                } else if (!data.equals("") && in.equals("")) {
                    System.out.println(decrypt(data, key));
                } else if (!data.equals("") && !in.equals("")) {
                    System.out.println(decrypt(data, key));
                }
            } else {
                if (data.equals("") && !in.equals("")) {
                    File file = new File(in);
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    Scanner scanner = new Scanner(file);
                    String lin = scanner.nextLine();
                    StringBuilder l = decrypt(lin, key);
                    writer.write(String.valueOf(l));
                    scanner.close();
                    writer.close();

                } else if (!data.equals("") && in.equals("")) {
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    StringBuilder l = decrypt(data, key);
                    writer.write(String.valueOf(l));
                    writer.close();
                } else if (!data.equals("") && !in.equals("")) {
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    StringBuilder l = decrypt(data, key);
                    writer.write(String.valueOf(l));
                    writer.close();
                }
            }
        }

        if (!decrypter && alg.equals("shift")) {
            if (out.equals("")) {
                if (data.equals("") && !in.equals("")) {
                    File file = new File(in);
                    Scanner scanner = new Scanner(file);
                    String lin = scanner.nextLine();
                    System.out.println(encrypt(lin, key));
                    scanner.close();
                } else if (!data.equals("") && in.equals("")) {
                    System.out.println(encrypt(data, key));
                } else if (!data.equals("") && in != "") {
                    System.out.println(encrypt(data, key));
                }
            } else {
                if (data.equals("") && !in.equals("")) {
                    File file = new File(in);

                    Scanner scanner = new Scanner(file);
                    String lin = scanner.nextLine().trim();
                    StringBuilder l = encrypt(lin, key);
                    scanner.close();
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    writer.write(String.valueOf(l));

                    writer.close();
                } else if (!data.equals("") && in.equals("")) {
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    StringBuilder l = encrypt(data, key);
                    writer.write(String.valueOf(l));
                    writer.close();
                } else if (!data.equals("") && !in.equals("")) {
                    File file2 = new File(out);
                    FileWriter writer = new FileWriter(file2);
                    StringBuilder l = encrypt(data, key);
                    writer.write(String.valueOf(l));
                    writer.close();
                }
            }
        }

    }


    private static String decryptUnicode(String str, int key) {
        char[] charsFromString = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            charsFromString[i] -= key;
        }

        return new String(charsFromString);

    }

    private static String encryptUnicode(String str, int key) {
        char[] charsFromString = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            charsFromString[i] += key;
        }

        return new String(charsFromString);

    }

    public static StringBuilder encrypt(String str, int key) {

        StringBuilder result = new StringBuilder();
        for (char character : str.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result;
    }

    public static StringBuilder decrypt(String str, int key) {

        StringBuilder result = new StringBuilder();
        for (char character : str.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition - key + 26) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result;
    }


}

