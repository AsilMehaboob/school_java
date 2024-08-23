#include <stdio.h>

#define n 5
int stack[n], top = -1;

void push(int data)
{
    if (top == n - 1)
        printf("Overflow\n");
    else
    {
        top = top + 1;
        stack[top] = data;
    }
}

void pop()
{
    int data;
    if (top == -1)
        printf("Underflow\n");
    else
    {
        data = stack[top];
        top = top - 1;
    }
}

void display()
{
    if (top == -1)
        printf("Empty stack\n");
    else
    {
        for (int i = 0; i <= top; i++)
            printf("%d ", stack[i]);  // Added space for clarity
        printf("\n");
    }
}

void peak()
{
    if (top != -1)
        printf("Top is %d\n", stack[top]);
    else
        printf("Empty stack\n");
}

int main()
{
    int ch, data;
    char y;

    do
    {
        printf("Choose\n");
        printf("1.push 2.display 3.pop 4.peak\n");  // Corrected "push" to "pop"
        scanf("%d", &ch);
        switch (ch)
        {
            case 1:
                printf("Enter element: ");
                scanf("%d", &data);
                push(data);
                break;
            case 2:
                display();
                break;
            case 3:
                pop();
                break;
            case 4:
                peak();
                break;
            default:
                printf("Invalid choice\n");
        }
        printf("Continue? (Y/N): ");
        scanf(" %c", &y);  // Added space before %c
    } while ((y == 'Y') || (y == 'y'));

    return 0;
}