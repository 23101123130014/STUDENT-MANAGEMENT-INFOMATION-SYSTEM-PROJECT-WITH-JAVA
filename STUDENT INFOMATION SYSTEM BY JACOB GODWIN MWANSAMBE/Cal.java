                numbers.add(input.nextDouble());
            } else if (input.hasNext("done")) {
                input.next(); // Consume the "done" input
                break;
            } else {
                System.out.println("Invalid input. Please enter a number or 'done'.");
                input.next(); // Consume invalid input
            }
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        System.out.print("The sum of the numbers is: ");
        System.out.println(sum);

        input.close();
    }
}